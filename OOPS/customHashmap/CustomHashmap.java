package OOPS.customHashmap;

import java.util.*;

public class CustomHashmap <K,V>{
    List<List<Pair<K,V>>> list;
    private static final Integer DEFAULT_HASH_SIZE = 100;

    public CustomHashmap() {
        list = new ArrayList<>(DEFAULT_HASH_SIZE);
    }

    public V put(K key, V value) {
        int index = hash(key);

        if (list.get(index) == null) {
            list.add(index, new LinkedList<Pair<K,V>>());
        }

        list.get(index).add(new Pair<>(key, value));
        return value;
    }

    public V get(K key) {
        int index = hash(key);

        return Optional.ofNullable(list.get(index))
                .orElse(new ArrayList<>())
                .stream()
                .filter(pairs ->  key == pairs.getKey())
                .map(Pair::getValue)
                .findFirst()
                .orElse(null);
    }

    private int hash(K key) {
        int i = key.hashCode();
        return i % DEFAULT_HASH_SIZE;
    }
}

class Pair <K,V>{
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}