package datastructures;

public class DisjointedSet {       // dsu - disjointed set union or union-find

    private final int[] parent;                   // Use to store the parent/representative/root of each node
    private final int[] rank;                     // Used at union to keep the tree balanced

    public DisjointedSet(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;          // Each node is its own parent at the start
            rank[i] = 0;
        }
    }

    public int find(int node) {                     // will return the representative of the node
        if (parent[node] != node) {                 // if node it's not its own representative
            parent[node] = find(parent[node]);      // keep on traversing the tree until find the representative/root/parent
        }                                           // Set the root directly as the representative of this node(path compression/Flattening the tree)
        return parent[node];
    }

    // Union operation (merging two sets)
    public void union(int xNode, int yNode) {       // merge the sets where xNode and yNode belong
        int rootX = find(xNode);                    // get representative for both elements
        int rootY = find(yNode);

        if (rootX != rootY) {                       // Merge sets by setting the representative of second element's root to first element root
            if (rank[rootX] > rank[rootY]) {        // set the root of the smaller tree to the bigger one
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {                                // if the tree are equal set the root of the second to the first
                parent[rootY] = rootX;
                rank[rootX]++;                      // Increase the rank of the root, because the depth of tree has increased by one
            }                                       // depth been the same at that point, adding a new node to one tree(the new root) increased size by one
        }
    }

    public int getParent(int i) {
        return parent[i];
    }

    public int getRank(int i) {
        return rank[i];
    }
}
