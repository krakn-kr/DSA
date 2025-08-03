package august2025.q242.BF;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public boolean isAnagram(String s, String t) {

        List<Character> sList = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        Collections.sort(sList);
        List<Character> tList = t.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        Collections.sort(tList);
        s = sList.stream().map(String::valueOf)
                .collect(Collectors.joining());
        t = tList.stream().map(String::valueOf)
                .collect(Collectors.joining());
        return s.equals(t);
    }
}