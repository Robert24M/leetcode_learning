package bfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];        // track visited cites
        int provinces = 0;
        for (int city = 0; city < isConnected.length; city++) {     // iterate over cities
            if (!visited[city]) {                                   // if city is not visited apply bfs
                bfs(isConnected, visited, city);
                provinces++;                                        // for each call increment number of provinces
            }
        }
        return provinces;
    }

    public void bfs(int[][] isConnected, boolean[] visited, int city) {
        Queue<Integer> levelQueue = new ArrayDeque<>();
        levelQueue.add(city);                           // consider the city as the starting point
        visited[city] = true;                           // mark it as visited

        while (!levelQueue.isEmpty()) {                 // while has levels
            int currentCity = levelQueue.poll();        // take every city than need to be visited
//            visited[currentCity] = true;
            for (int neighbour = 0; neighbour < isConnected.length; neighbour++) {      // iterate over its neighbors, length of neighbors is the same with length of cities
                if (isConnected[currentCity][neighbour] == 1 && !visited[neighbour]) {  // if the current city has a connection with the neighbor and it's not already visited
                    levelQueue.add(neighbour);                                          // ad the neighbor to the que to be visited in the next queue iteration
                    visited[neighbour] = true;                                          // mark city as visited here so if this appears as a neighbor for more cities,
                }                                                                       // it will not be added again in the queue
            }
        }
    }
}
