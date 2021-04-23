/** Array based list.
 *  @author Josh Hug
 */

// 2.5 naive array list

public class AList<T> {
  /** properties */
  public int size;
  public T[] item;
  // for geometircal resizing
  private int REFACTOR = 2;
  // for geometrical de-sizing: usage ratio
  private double R;
  private double Rbar = 0.25; // if lower, half the size
    /** Creates an empty list. */
    public AList() {
      size = 0;
      item = (T []) new Object[100];
    }

    /** resizing */
    private void resize(int toCapacity) {
        T[] newItem = (T []) new Object[toCapacity];
        System.arraycopy(item, 0, newItem, 0, size);
        item = newItem;
    }

    /** Inserts X into the back of the list. */
    public void addLast(T x) {
        if (item.length == size) {
            resize(size * REFACTOR);
        }
        item[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public T getLast() {
        return item[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public T get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public T removeLast() {
        // memory manage
        R = (double)size/(double)item.length;
        if (R < Rbar) {
            resize(item.length / 2);
        }
        T res = getLast();
        // null out "deleted val"
        item[size - 1] = null;
        size -= 1;
        return res;
    }
}
