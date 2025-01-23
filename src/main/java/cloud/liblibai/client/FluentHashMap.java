package cloud.liblibai.client;

public class FluentHashMap<K, V> extends java.util.HashMap<K, V> {
    public FluentHashMap<K, V> with(K key, V value) {
        put(key, value);
        return this;
    }

    public static <K, V> FluentHashMap<K, V> map(K key, V value) {
        return new FluentHashMap<K, V>().with(key, value);
    }
}
