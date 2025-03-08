package trie;

public class ImplementTrie {        // Prefix tree

    private final TrieNode root;

    public ImplementTrie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode node = root;
        for (int character : word.toCharArray()) {
            int index = character - 'a';        // subtract ascii value of a from letter
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {

        TrieNode node = root;
        for (int character : word.toCharArray()) {
            int index = character - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {

        TrieNode node = root;
        for (int character : prefix.toCharArray()) {
            int index = character - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }

    class TrieNode {
        TrieNode[] children = new TrieNode[27];
        boolean isEndOfWord;
    }
}
