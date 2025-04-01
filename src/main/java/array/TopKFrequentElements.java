package array;

import java.util.*;

public class TopKFrequentElements {

    // First in mind solution using a map and sorting the elements
    public int[] topKFrequentSort(int[] nums, int k) {
        Map<Integer, Integer> occurrence = new HashMap<>();
        for (int i : nums) {
            occurrence.put(i, occurrence.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = occurrence.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .toList();
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // Using priority queue
    public int[] topKFrequentPriorityQueue(int[] nums, int k) {
        Map<Integer, Integer> occurrence = new HashMap<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> occurrence.get(b) - occurrence.get(a));
        for (int i : nums) {
            occurrence.put(i, occurrence.getOrDefault(i, 0) + 1);
        }
        priorityQueue.addAll(occurrence.keySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }

    // Using bucket sort
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] occurrenceBucket = new ArrayList[nums.length + 1];
        Map<Integer, Integer> occurrence = new HashMap<>();
        for (int i : nums) {
            occurrence.put(i, occurrence.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrence.entrySet()) {
            ArrayList<Integer> currentBucket;

            currentBucket = occurrenceBucket[entry.getValue()];
            if (currentBucket == null) {
                currentBucket = new ArrayList<>(k);
            }
            occurrenceBucket[entry.getValue()] = currentBucket;

            currentBucket.add(entry.getKey());
        }
        int resultIndex = 0;
        int[] result = new int[k];
        for (int i = occurrenceBucket.length - 1; i > -1; i--) {
            List<Integer> currentBucket;

            currentBucket = occurrenceBucket[i];
            if (currentBucket == null) {
                continue;
            }

            for (Integer j : currentBucket) {
                if (resultIndex >= k) {
                    return result;
                }
                result[resultIndex++] = j;
            }
        }
        return result;
    }
}

