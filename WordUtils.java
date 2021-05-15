// 4.1.1 wordutils

public class WordUtils {
    // utils
    public static String longest(AList<String> list) {
        int maxIdx = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(maxIdx).length() < list.get(i).length()) {
                maxIdx = i;
            }
        }
        return list.get(maxIdx);
    }

}
