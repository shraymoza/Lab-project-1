import java.util.ArrayList;
import java.util.List;

public class KeyValueStore<K, V> {
    private List<Node<K, V>> nodes;

    public KeyValueStore() {
        nodes = new ArrayList<>();
    }

    // Node class for key-value pair
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Method to get the value by key
    public V get(K key) {
        for (Node<K, V> node : nodes) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    // Method to put a key-value pair
    public void put(K key, V value) {
        for (Node<K, V> node : nodes) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        nodes.add(new Node<>(key, value));
    }

    // Method to get the size of the map
    public int size() {
        return nodes.size();
    }

    // Method to check if a key exists
    public boolean containsKey(K key) {
        for (Node<K, V> node : nodes) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }
}

