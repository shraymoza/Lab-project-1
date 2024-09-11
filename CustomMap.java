import java.util.ArrayList;
import java.util.List;

public class CustomMap<K, V> {
    private List<Node<K, V>> nodes;

    public CustomMap() {
        nodes = new ArrayList<>();
    }

    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public V get(K key) {
        for (Node<K, V> node : nodes) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        for (Node<K, V> node : nodes) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        nodes.add(new Node<>(key, value));
    }

    public int size() {
        return nodes.size();
    }

    public boolean contains(K key) {
        for (Node<K, V> node : nodes) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CustomMap<String, Integer> map = new CustomMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println("Size: " + map.size()); // Output: Size: 2
        System.out.println("Value for 'one': " + map.get("one")); // Output: Value for 'one': 1
        System.out.println("Contains 'two': " + map.contains("two")); // Output: Contains 'two': true
    }
}
