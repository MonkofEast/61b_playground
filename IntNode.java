// 2.2 SLList: A Better Resemble to Modern List
// Step 1: Alternate IntList
public class IntNode {
    // properties
    public int item;
    public IntNode next;
    // constructor //
    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }

    // size() //
    // recursive size()
    public int size() {
      if (next == null) {
          return 1;
      }
      return 1 + this.next.size();
    }
    // iter size()
    public int iterativeSize() {
      IntNode p = this;
      int totalSize = 0;
      while (p != null) {
          totalSize += 1;
          p = p.next;
      }
      return totalSize;
    }

    // get() //
    // recursive get()
    public int recurGet(int i) {
      if (i == 0) {
        return this.item;
      }
      return this.next.recurGet(i-1);
    }
    // iter get()
    public int iterGet(int i) {
      int currIdx = 0;
      IntNode tmpAddr = this;
      while (currIdx != i) {
        currIdx += 1;
        tmpAddr = tmpAddr.next;
      }
      return tmpAddr.item;
    }

    /*
    increase IntNode //
    (1) copy
    (2) each item add an int
    (3) don't touch the oiriginal IntNode
    (4) static-method
    (5) iter & recur
    */
    // iter
    public static IntNode iterIncrNode(IntNode L, int x) {
      IntNode res = new IntNode(L.item + x, null);
      IntNode tmpAddr = L.next;
      IntNode tmpRes = res;
      while(tmpAddr != null) {
        tmpRes.next = new IntNode(tmpAddr.item + x, null);
        tmpRes = tmpRes.next;
        tmpAddr = tmpAddr.next;
      }
      return res;
    }
    // recur
    public static IntNode recurIncrNode(IntNode L, int x) {
      // check nullerr
      // stupid: only 1 if() is necessary
      if (L == null){
        System.out.println("Original Node is null");
        return null;
      }
      else {
        IntNode tmpL = new IntNode(L.item + x, null);
        // recur
        if (L.next == null) {
          return tmpL;
        }
        else {
          tmpL.next = recurIncrNode(L.next, x);
          return tmpL;
        }
      }
    }


    /*
    dincrNode (distructive)
    (1) return a intNode identical to oiriginal Node
    (2) increase by x
    (3) no "new" to save memory
    */
    // recur //
    public static IntNode recurDincrNode(IntNode L, int x) {
      // check nullerr (skip)
      L.item = L.item + x;
      // recur
      if (L.next == null) {
        return L;
      }
      else {
        L.next = recurDincrNode(L.next, x);
        return L;
      }
    }
    // iter //
    public static IntNode iterDincrNode(IntNode L, int x) {
      IntNode tmpAddr = L;
      while (tmpAddr != null) {
        tmpAddr.item += x;
        tmpAddr = tmpAddr.next;
      }
      return L;
    }


    /* main */
    public static void main(String[] args) {
      // set ground
      IntNode atest = new IntNode(5, null);
      atest.next = new IntNode(10, null);
      atest.next.next = new IntNode(15, null);
      /* test recur get() */
      //int ares = atest.recurGet(1);
      //System.out.println(ares);
      /* test iter get() */
      //int bres = atest.iterGet(1);
      //System.out.println(bres);
      /* test iterIncrNode() */
      //IntNode iterIncrtest = IntNode.iterIncrNode(atest, 2);
      //System.out.println(atest.recurGet(1));
      //System.out.println(iterIncrtest.recurGet(1));
      /* test recurIncrNode() */
      //IntNode recurIncrtest = IntNode.recurIncrNode(atest, 2);
      //System.out.println(recurIncrtest.recurGet(1));
      /* test recurDincrNode */
      IntNode recurDincrL = IntNode.recurDincrNode(atest, 2);
      System.out.println(atest.recurGet(1));
      System.out.println(recurDincrL.recurGet(1));
      /* test iterDincrNode */
      IntNode iterDincrL = IntNode.iterDincrNode(atest, 2);
      System.out.println(iterDincrL.recurGet(1));
    }

}
