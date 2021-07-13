// exe 5.3
package Map61B;

import java.util.List;

public class MapHelper {
    public static <TK, TV> TV get(Map61B<TK, TV> aMap, TK key) {
        if (aMap.containsKey(key)) return (TV) aMap.get(key);
        return null;
    }

    public static <TK extends Comparable<TK>, TV> TK maxKey(Map61B<TK, TV> aMap) {
        TK[] keylist = aMap.keys();
        TK largest = keylist[0];

        for (TK k: keylist) if (k.compareTo(largest) > 0) largest = k;
        return largest;
    }
}
