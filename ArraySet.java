// for 6.1
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ArraySet<T> implements Iterable<T> {
    /* properties
     */
    private T[] items;
    private int size;

    /* construct
    */
    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }
    /* self-made iterator
     */
    private class ArraySetIterator implements Iterator<T> {
        private int idx;
        public ArraySetIterator() {
            idx = 0;
        }

        public boolean hasNext() {
            return idx < size;
        }

        public T next() {
            T res = items[idx];
            idx++;
            return res;
        }
    }

    /* check to see if contain the key
     */
    public boolean contains(T akey) {
        for (int i = 0; i < size; i++) if (items[i].equals(akey)) return true;
        return false;
    }

    /* add new key
     */
    public void add(T akey) {
        if (akey == null) throw new IllegalArgumentException("Can't add null");
        if (contains(akey)) return;
        items[size] = akey;
        size += 1;
    }

    /* return the size
     */
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }
    /* to string
    */
    /*
    @Override
    public String toString() {
        StringBuilder resSB = new StringBuilder("{");
        for (int i = 0; i < size-1; i++) {
            resSB.append(items[i].toString());
            resSB.append(", ");
        }
        resSB.append(items[size-1]);
        resSB.append("}");
        return resSB.toString();
    }
     */
    @Override
    public String toString() {
        List<String> resList = new ArrayList<String>();
        for (T i : this) resList.add(i.toString());
        return String.join(", ", resList);
        // return "{" + String.join(", ", resList) + "}";
        // may take as much as twice time, but I think fine since string is not a frequently called method
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        ArraySet<T> other = (ArraySet<T>) o;
        if (this.size() != other.size()) return false;
        for (T i : other) if (!this.contains(i)) return false;
        return true;
    }
}
