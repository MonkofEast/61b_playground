// 2.2: SLList
// Step 2: SLList
public class SLList {
  // base class
  public class IntNode {
      public int item;
      public IntNode next;
      public IntNode(int i, IntNode n) {
          item = i;
          next = n;
      }
  }
  /* properties */
  private int size;
  private IntNode sentinel;
  /* constructor */
  // with value
  public SLList(int x) {
    size = 1;
    IntNode tmp = new IntNode(x, null);
    sentinel = new IntNode(-1111, tmp);
  }
  // empty
  public SLList() {
    size = 0;
    sentinel = new IntNode(-1111, null);
  }
  /* Add an "item"(plus "next" of course) to the "first" property */
  // backward adding
  public void addFirst(int x) {
    sentinel.next = new IntNode(x, sentinel.next);
    size += 1;
  }
  /* get the first "item" in "first" */
  public int getFirst() {
    return sentinel.next.item;
  }
  /** Adds an item to the end of the list. */
  // getting
  public int getLast() {
    IntNode tmpNode = sentinel;
    while(tmpNode.next != null) {
      tmpNode = tmpNode.next;
    }
    return tmpNode.item;
  }
  // adding
  public void addLast(int x) {
    IntNode tmpNode = sentinel;
    while(tmpNode.next != null) {
      tmpNode = tmpNode.next;
    }
    tmpNode.next = new IntNode(x, null);
    size += 1;
  }
  /** get size (caching) */
  public int size() {
    return size;
  }

  /** Returns the number of items in the list. */
  // overload
  // recursion //
  // useless, just practice
  // 1. the private helper
  /*
  private static int recurSize(IntNode N) {
    if (N.next == null) {
      return 1;
    }
    else {
      return (1 + recurSize(N.next));
    }
  }
  // 2. the public interface
  public int recurSize() {
    return recurSize(first);
  }
  */
  // iter //
  /*
  public int iterSize() {
    int res = 0;
    IntNode tmpNode = sentinel;
    while(tmpNode.next != null) {
      res += 1;
      tmpNode = tmpNode.next;
    }
    return res;
  }
  */

  /** main */
  public static void main(String[] args) {
    /*
    create base case
    */
    //SLList bench = new SLList(5); // normal
    SLList bench = new SLList(); // empty
    /*
    test: add/getLast
    */
    //bench.addLast(10);
    //System.out.println(bench.getLast());
    /*
    test: size()
    */
    //bench.addFirst(15);
    //System.out.println(bench.recurSize());
    //System.out.println(bench.iterSize());
    /*
    test:
    size(property), empty constructor, addLast(empty)
    getLast(), getFirst
    */
    System.out.println(bench.size());
    bench.addLast(10);
    System.out.println(bench.getLast());
    System.out.println(bench.size());
    bench.addFirst(5);
    System.out.println(bench.getFirst());
    System.out.println(bench.size());
  }

}
