// exe 4.4.1, 4.4.2
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class UseADTs {
    // use list
    public static List<String> getWords(String inputFileName) {
        List<String> res = new ArrayList<>();
        In in = new In(inputFileName);
        while (!in.isEmpty()) {
            res.add(in.readString());
        }
        return res;
    }
    // use set
    public static int countUniqueWords(List<String> strList) {
        Set<String> res = new HashSet<>();
        for (String s: strList) {
            res.add(s);
        }
        return res.size();
    }
    // use map
    public static Map<String, Integer> collectWordCount(List<String> targets, List<String> words) {
        Map<String, Integer> res = new HashMap<>();
        int tmpCount = 0;
        for (String targetStr: targets) {
            for (String aword: words) {
                if (aword.equals(targetStr)) tmpCount++;
            }
            res.put(targetStr, tmpCount);
            tmpCount = 0;
        }
        return res;
    }
    // main
    public static void main(String[] args) {
        // test List
        String fileName = "strings_441.txt";
        List<String> strList = getWords(fileName);
        Iterator itr = strList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // test Set
        int uniqueNum = countUniqueWords(strList);
        System.out.println(uniqueNum);
        // test Map
        List<String> targets = new ArrayList<>();
        targets.add("this");
        targets.add("!");
        targets.add("do");
        Map<String, Integer> resMap = collectWordCount(targets, strList);
        for (String akey: resMap.keySet()) {
            System.out.println(akey + ": " + resMap.get(akey));
        }
    }
}
