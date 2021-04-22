// 2.3: DLList
// circular sentinel + double linked

public class DLList<laoliu> {
  // base class
  public class IntNode {
      public IntNode prev;
      public laoliu item;
      public IntNode next;
      public IntNode(laoliu i, IntNode n, IntNode p) {
          item = i;
          next = n;
          prev = p;
      }
  }
  /* properties */
  private int size;
  private IntNode sentinel;
  /* constructor */
  // with value
  public DLList(laoliu x) {
    sentinel = new IntNode(null, null, null);
    IntNode tmp = new IntNode(x, sentinel, sentinel);
    sentinel.prev = tmp;
    sentinel.next = tmp;
    size = 1;
  }
  // empty
  public DLList() {
    size = 0;
    sentinel = new IntNode(null, null, null);
    sentinel.prev = sentinel;
    sentinel.next = sentinel;
  }
  /** get size (caching) */
  public int size() {
    return size;
  }

  /** Adds an item to the end of the list. */
  // getting
  public laoliu getLast() {
    return sentinel.prev.item;
  }
  // adding
  public void addLast(laoliu x) {
    sentinel.prev.next = new IntNode(x, sentinel, sentinel.prev);
    sentinel.prev = sentinel.prev.next;
    size += 1;
  }
  /** removing last node */
  public void removeLast() {
    sentinel.prev = sentinel.prev.prev;
    sentinel.prev.next = sentinel;
    size -= 1;
  }

  /** print */
  public void printAll() {
    IntNode tmp = sentinel.next;
    while (tmp.next != sentinel) {
      System.out.println(tmp.item);
      tmp = tmp.next;
    }
  }

  /** main */
  public static void main(String[] args) {
    /*
    create base case
    */
    DLList<String> bench1 = new DLList<>("one"); // normal
    DLList<String> bench0 = new DLList<>(); // empty
    // test: size(); get/addLast(); removeLast();
    System.out.println(bench1.size()); // 1
    System.out.println(bench0.size()); // 0

    System.out.println(bench0.getLast()); // null
    bench0.addLast("two");
    System.out.println(bench0.size()); // 1
    System.out.println(bench0.getLast()); // two

    bench0.addLast("three");
    System.out.println(bench0.size()); // 2
    System.out.println(bench0.getLast()); // three

    bench0.removeLast();
    System.out.println(bench0.size()); // 1
    System.out.println(bench0.getLast()); // two
  }

}
