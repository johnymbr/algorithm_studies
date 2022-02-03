import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new ArrayList<>();
        if (s.length() < p.length()) return ret;

        int[] freq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a'] += 1;
            freq[s.charAt(i) - 'a'] -= 1;
        }

        int j = 0;
        for (; j < s.length() - p.length(); j++) {
            if (check(freq)) {
                ret.add(j);
            }

            freq[s.charAt(j) - 'a'] += 1;
            freq[s.charAt(j + p.length()) - 'a'] -= 1;
        }

        if (check(freq)) ret.add(j);

        return ret;
    }

    private boolean check(int[] freq) {
        for (Integer i : freq) {
            if (i != 0) return false;
        }
        return true;
    }
}
