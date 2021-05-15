// 2.2: SLList
// Step 2: SLList
public class SLList<T> {
  // base class
  public class IntNode {
      public T item;
      public IntNode next;
      public IntNode(T i, IntNode n) {
          item = i;
          next = n;
      }
  }
  /* properties */
  private int size;
  private IntNode sentinel;
  private IntNode last;
  /* constructor */
  // with value
  public SLList(T x) {
    size = 1;
    IntNode tmp = new IntNode(x, null);
    sentinel = new IntNode(null, tmp);
    last = tmp;
  }
  // empty
  public SLList() {
    size = 0;
    IntNode tmp = new IntNode(null, null);
    sentinel = tmp;
    last = tmp;
  }
  /* Add an "item"(plus "next" of course) to the "first" property */
  // backward adding
  public void addFirst(T x) {
    sentinel.next = new IntNode(x, sentinel.next);
    size += 1;
  }
  /* get the first "item" in "first" */
  public T getFirst() {
    return sentinel.next.item;
  }
  /** Adds an item to the end of the list. */
  // getting
  public T getLast() {
    return last.item;
  }
  // adding
  public void addLast(T x) {
    IntNode tmpNode = sentinel;
    while(tmpNode.next != null) {
      tmpNode = tmpNode.next;
    }
    tmpNode.next = new IntNode(x, null);
    size += 1;
    last = last.next;
  }
  /** get i-th element */
  public T get(int idx) {
    IntNode tmpNode = sentinel.next;
    for (int i = 0; i < size; i++) {
      if (i == idx) {
        return tmpNode.item;
      }
      tmpNode = tmpNode.next;
    }
    return null;
  }
  /** remove last element */
  public T removeLast() {
    if (size == 0) {
      return null;
    }
    IntNode tmpNode = sentinel;
    while (tmpNode.next.next != null) {
      tmpNode = tmpNode.next;
    }
    T res = tmpNode.next.item;
    tmpNode.next = null;
    size -= 1;
    return res;
  }
  /** get size (caching) */
  public int size() {
    return size;
  }
  /** print */
  public void print() {
    if (size == 0) {
      return;
    }
    IntNode tmpNode = sentinel;
    for (int i = 0; i < size; i++) {
      System.out.println(tmpNode.next.item);
      tmpNode = tmpNode.next;
    }
  }

  /** main */
  public static void main(String[] args) {
    /*
    create base case
    */
    //SLList bench = new SLList(5); // normal
    SLList<Integer> bench = new SLList<>(); // empty
    /*
    test: add/getLast
    */
    //bench.addLast(10);
    //System.out.println(bench.getLast());
    /*
    test:
    size(property), empty constructor, addLast(empty)
    getLast(), getFirst
    */
    /*
    System.out.println(bench.size());
    bench.addLast(10);
    System.out.println(bench.getLast());
    System.out.println(bench.size());
    bench.addFirst(5);
    System.out.println(bench.getFirst());
    System.out.println(bench.size());
    */
    bench.addLast(1);
    bench.addLast(2);
    bench.addLast(3);
    System.out.println(bench.removeLast());
    System.out.println(bench.get(bench.size() - 1));
  }

}
