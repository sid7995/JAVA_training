
import java.util.HashMap;

import java.util.Map;


public class Animal {


    private class TrieNode {
        Map<Character, TrieNode> children;
        String voice;


        public TrieNode() {
            children = new HashMap<>();
            voice = null;
        }
    }


    private final TrieNode root;

    public Animal() {
        root = new TrieNode();
    }


    /**
     * Iterative implementation of insert into trie
     */
    public void insert(String word, String voice) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        //mark the current nodes endOfWord as true
        current.voice = voice;
    }


    public String search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            //if node does not exist for given char then return false
            if (node == null) {
                return null;
            }
            current = node;
        }
        //return true of current's endOfWord is true else return false.
        if (current.voice != null)
            return current.voice;
        else
            return null;
    }
}
