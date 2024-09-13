public class Main {
    public static void main(String[] args) {
        KeyValueStore<String, Integer> map = new KeyValueStore<>();

        // Adding key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put(null, null);
        map.put("one", 3);
        map.put("one", 4);

        // Checking the size of the map
        System.out.println("Map Size: " + map.size());

        // Retrieving value by key
        System.out.println("Value for 'one': " + map.get("one"));
        System.out.println("Value for 'two': " + map.get("two"));
        System.out.println("Value for 'null': " + map.get(null));

        // Checking if a key exists
        System.out.println("Contains 'one': " + map.containsKey("one"));
        System.out.println("Contains 'two': " + map.containsKey("two"));
        System.out.println("Contains 'null': " + map.containsKey(null));
        System.out.println("Contains 'three': " + map.containsKey("three"));
    }
}
