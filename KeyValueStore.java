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
            //making sure that null values get handled for our map properly along with non null values
            if ((key == null && node.key == null) || (key != null && key.equals(node.key))) {
                return node.value;
            }
        }
        return null;
    }

    // Method to put a key-value pair
    public void put(K key, V value) {
        for (Node<K, V> node : nodes) {
            //making sure that null values get handled for our map properly along with non null values
            if ((key == null && node.key == null) || (key != null && key.equals(node.key))) {
                node.value = value;
                return;
            }
        }
        //add new node object with key value pair to array list nodes
        nodes.add(new Node<>(key, value));
    }

    // Method to get the size of the map
    public int size() {
        // array list size is returned to the user denoting the size of the map
        return nodes.size();
    }

    // Method to check if a key exists
    public boolean containsKey(K key) {
        for (Node<K, V> node : nodes) {
            if ((key == null && node.key == null) || (key != null && key.equals(node.key))) {
                return true;
            }
        }
        return false;
    }
}
