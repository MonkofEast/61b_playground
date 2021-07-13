// exe 5.3
package Map61B;

public interface Map61B<TK, TV> {
    void put(TK key, TV value); // Associate key with value.
    boolean containsKey(TK key); // Checks if map contains the key.
    TV get(TK key); // Returns value, assuming key exists.
    TK[] keys(); // Returns a list of all keys.
    int size(); // Returns number of keys.
}
