package trie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImplementTrieTest {

    private ImplementTrie trie;

    @BeforeEach
    void setUp() {
        trie = new ImplementTrie();
    }

    @Test
    void testInsertAndSearchSimpleWord() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));  // Word should exist
        assertFalse(trie.search("app"));   // "app" is a prefix but not a full word
    }

    @Test
    void testInsertAndPrefixCheck() {
        trie.insert("app");
        assertTrue(trie.startsWith("app"));  // "app" exists as a prefix
        assertFalse(trie.startsWith("apx")); // "apx" is not in the Trie
    }

    @Test
    void testComplexScenario() {
        trie.insert("banana");
        trie.insert("band");
        trie.insert("bat");
        trie.insert("batch");

        assertTrue(trie.search("banana"));
        assertTrue(trie.search("band"));
        assertTrue(trie.search("bat"));
        assertTrue(trie.search("batch"));

        assertFalse(trie.search("ban"));
        assertFalse(trie.search("bats"));
        assertFalse(trie.search("batc")); // Partial match but not full word

        assertTrue(trie.startsWith("ban"));
        assertTrue(trie.startsWith("bat"));
        assertFalse(trie.startsWith("baz"));
    }

}
