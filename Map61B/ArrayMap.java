// exe 5.3
package Map61B;

import java.util.List;
import java.util.ArrayList;

public class ArrayMap<TK, TV> implements Map61B<TK, TV> {
    /** properties */
    public TK[] keys;
    public TV[] values;
    public int size;
    /** constructor */
    public ArrayMap() {
        keys = (TK[]) new Object[100];
        values = (TV[]) new Object[100];
        size = 0;
    }
    /** methods */
    // adding key-value pair
    public void put(TK key, TV value) {
        keys[size] = key;
        values[size] = value;
        size += 1;
    }
    // check if a key exsist
    private int getKeyIdx(TK key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) return i;
        }
        return -1;
    }
    public boolean containsKey(TK key) {
        int tmpRes = getKeyIdx(key);
        return tmpRes > -1;
    }
    // get the value given a key
    public TV get(TK key) {
        int idx = getKeyIdx(key);
        return values[idx];
    }
    // return a list of keys
    public TK[] keys() {
        return keys;
    }
    // return size
    public int size() {
        return size;
    }

}
