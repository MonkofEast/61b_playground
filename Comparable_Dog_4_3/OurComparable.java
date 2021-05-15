package Comparable_Dog_4_3;

public interface OurComparable {
    public int compareTo(Object o);
    public static OurComparable max(OurComparable[] items) {
        int maxIdx = 0;
        for (int i = 0; i < items.length; i++) {
            int cmpRes = items[i].compareTo(items[maxIdx]);
            if (cmpRes > 0) maxIdx = i;
        }
        return items[maxIdx];
    }
}
