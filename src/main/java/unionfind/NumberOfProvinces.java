package unionfind;

import datastructures.DisjointedSet;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {

        DisjointedSet disjointedSet = new DisjointedSet(isConnected.length);
        int provinces = isConnected.length;
        for (int city = 0; city < isConnected.length; city++) {
            for (int neighbour = city + 1; neighbour < isConnected.length; neighbour++) {       // start from the next neighbour been that the connections are specified in both cites
                int rootCity = disjointedSet.find(city);                                        // and we already check that in the previous city
                int rootNeighbour = disjointedSet.find(neighbour);
                if (isConnected[city][neighbour] == 1 && rootNeighbour != rootCity) {
                    disjointedSet.union(city, neighbour);
                    provinces--;
                }
            }
        }
        return provinces;
    }
}
