package dfs;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;                                   // keep track of how many times do I start a new dfs
        boolean[] visited = new boolean[isConnected.length]; // keep track of visited cities
        for (int city = 0; city < isConnected.length; city++) {
            if (!visited[city]) {                               // if the city was not visited start a dfs
                dfs(isConnected, visited, city);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;                                                   // mark the city as visited
        for (int neighbor = 0; neighbor < isConnected.length; neighbor++) {     // iterate over neighbors
            if (isConnected[city][neighbor] == 1 && !visited[neighbor]) {       // if this city is connected with the neighbor and is unvisited
                dfs(isConnected, visited, neighbor);                            // visit it and dfs on it
            }
        }
    }
}
