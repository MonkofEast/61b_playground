// exc 1.2.3
// summing command line arguments
/*
Try to write a program that sums up the command line arguments
, assuming they are numbers.
For a solution, see the webcast or the code provided on GitHub.
*/

public class exe_123 {
  public static void main(String[] args) {
    int nlen = args.length;
    int i = 0;
    int nsum = 0;
    while (i < nlen) {
      nsum += Integer.parseInt(args[i]);
      //;
      System.out.println(args[i]);
      //;
      i += 1;
    }
    System.out.println(nsum);
    //System.out.println(nlen);
    //System.out.println(args[0]);
  }
}
