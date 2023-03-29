package Finals;

public class Hashtables2<keys, values> {

    private int capacity;
    private int size;
    private keys[] keys;
    private values[] values;

    public Hashtables2(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.keys = (keys[]) new Object[capacity];
        this.values = (values[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(keys key, values value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Null key or value");
        }
        if (size >= capacity * 0.75) {
            resize(capacity * 2);
        }
        int index = hash(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                values[index] = value;
                return;
            }
            index = (index + 1) % capacity;
        }
        keys[index] = key;
        values[index] = value;
        size++;
    }

    public values get(keys key) {
        if (key == null) {
            throw new IllegalArgumentException("Null key");
        }
        int index = hash(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];
            }
            index = (index + 1) % capacity;
        }
        return null;
    }

    public void remove(keys key) {
        if (key == null) {
            throw new IllegalArgumentException("Null key");
        }
        int index = hash(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                keys[index] = null;
                values[index] = null;
                size--;
                int nextIndex = (index + 1) % capacity;
                while (keys[nextIndex] != null) {
                    keys keyToRehash = keys[nextIndex];
                    values valueToRehash = values[nextIndex];
                    keys[nextIndex] = null;
                    values[nextIndex] = null;
                    size--;
                    put(keyToRehash, valueToRehash);
                    nextIndex = (nextIndex + 1) % capacity;
                }
                if (size <= capacity * 0.25) {
                    resize(capacity / 2);
                }
                return;
            }
            index = (index + 1) % capacity;
        }
    }

    private int hash(keys key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private void resize(int newCapacity) {
        Hashtables2<keys, values> newTable = new Hashtables2<>(newCapacity);
        for (int i = 0; i < capacity; i++) {
            if (keys[i] != null) {
                newTable.put(keys[i], values[i]);
            }
        }
        capacity = newCapacity;
        keys = newTable.keys;
        values = newTable.values;
    }

    public static void main(String[] args) {

        Hashtables2<String, Integer> table = new Hashtables2<>(10);

        table.put("apple", 1);
        table.put("banana", 2);
        table.put("cherry", 3);
        table.put("date", 4);
        table.put("elderberry", 5);
        table.put("fig", 6);

        System.out.println(table.get("apple"));
        System.out.println(table.get("banana"));
        System.out.println(table.get("fig"));

    }
}