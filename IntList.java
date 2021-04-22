// 2.1 IntList Prototype
public class IntList {
    // properties
    public int first;
    public IntList rest;
    // constructor //
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    // size() //
    // recursive size()
    public int size() {
      if (rest == null) {
          return 1;
      }
      return 1 + this.rest.size();
    }
    // iter size()
    public int iterativeSize() {
      IntList p = this;
      int totalSize = 0;
      while (p != null) {
          totalSize += 1;
          p = p.rest;
      }
      return totalSize;
    }

    // get() //
    // recursive get()
    public int recurGet(int i) {
      if (i == 0) {
        return this.first;
      }
      return this.rest.recurGet(i-1);
    }
    // iter get()
    public int iterGet(int i) {
      int currIdx = 0;
      IntList tmpAddr = this;
      while (currIdx != i) {
        currIdx += 1;
        tmpAddr = tmpAddr.rest;
      }
      return tmpAddr.first;
    }

    /*
    increase IntList //
    (1) copy
    (2) each first add an int
    (3) don't touch the oiriginal IntList
    (4) static-method
    (5) iter & recur
    */
    // iter
    public static IntList iterIncrList(IntList L, int x) {
      IntList res = new IntList(L.first + x, null);
      IntList tmpAddr = L.rest;
      IntList tmpRes = res;
      while(tmpAddr != null) {
        tmpRes.rest = new IntList(tmpAddr.first + x, null);
        tmpRes = tmpRes.rest;
        tmpAddr = tmpAddr.rest;
      }
      return res;
    }
    // recur
    public static IntList recurIncrList(IntList L, int x) {
      // check nullerr
      // stupid: only 1 if() is necessary
      if (L == null){
        System.out.println("Original List is null");
        return null;
      }
      else {
        IntList tmpL = new IntList(L.first + x, null);
        // recur
        if (L.rest == null) {
          return tmpL;
        }
        else {
          tmpL.rest = recurIncrList(L.rest, x);
          return tmpL;
        }
      }
    }


    /*
    dincrLIst (distructive)
    (1) return a intlist identical to oiriginal list
    (2) increase by x
    (3) no "new" to save memory
    */
    // recur //
    public static IntList recurDincrList(IntList L, int x) {
      // check nullerr (skip)
      L.first = L.first + x;
      // recur
      if (L.rest == null) {
        return L;
      }
      else {
        L.rest = recurDincrList(L.rest, x);
        return L;
      }
    }
    // iter //
    public static IntList iterDincrList(IntList L, int x) {
      IntList tmpAddr = L;
      while (tmpAddr != null) {
        tmpAddr.first += x;
        tmpAddr = tmpAddr.rest;
      }
      return L;
    }


    /* main */
    public static void main(String[] args) {
      // set ground
      IntList atest = new IntList(5, null);
      atest.rest = new IntList(10, null);
      atest.rest.rest = new IntList(15, null);
      /* test recur get() */
      //int ares = atest.recurGet(1);
      //System.out.println(ares);
      /* test iter get() */
      //int bres = atest.iterGet(1);
      //System.out.println(bres);
      /* test iterIncrList() */
      //IntList iterIncrtest = IntList.iterIncrList(atest, 2);
      //System.out.println(atest.recurGet(1));
      //System.out.println(iterIncrtest.recurGet(1));
      /* test recurIncrList() */
      //IntList recurIncrtest = IntList.recurIncrList(atest, 2);
      //System.out.println(recurIncrtest.recurGet(1));
      /* test recurDincrList */
      IntList recurDincrL = IntList.recurDincrList(atest, 2);
      System.out.println(atest.recurGet(1));
      System.out.println(recurDincrL.recurGet(1));
      /* test iterDincrList */
      IntList iterDincrL = IntList.iterDincrList(atest, 2);
      System.out.println(iterDincrL.recurGet(1));
    }

}
