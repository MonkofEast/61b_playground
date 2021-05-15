package Comparable_Dog_4_3;

public class Maximizer {
    public static Comparable max(Comparable[] items) {
        int maxIdx = 0;
        for (int i = 0; i < items.length; i++) {
            int cmpRes = items[i].compareTo(items[maxIdx]);
            if (cmpRes > 0) maxIdx = i;
        }
        return items[maxIdx];
    }
}
