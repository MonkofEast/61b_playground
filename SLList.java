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
  private IntNode last;
  /* constructor */
  // with value
  public SLList(int x) {
    size = 1;
    IntNode tmp = new IntNode(x, null);
    sentinel = new IntNode(-1111, tmp);
    last = tmp;
  }
  // empty
  public SLList() {
    size = 0;
    IntNode tmp = new IntNode(-1111, null);
    sentinel = tmp;
    last = tmp;
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
    return last.item;
  }
  // adding
  public void addLast(int x) {
    IntNode tmpNode = sentinel;
    while(tmpNode.next != null) {
      tmpNode = tmpNode.next;
    }
    tmpNode.next = new IntNode(x, null);
    size += 1;
    last = last.next;
  }
  /** get size (caching) */
  public int size() {
    return size;
  }

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
