import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        if (s == null || s.isEmpty())
            return t.charAt(0);

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), 1 + map.getOrDefault(t.charAt(i), 0));
        }

        for (int i = 0; i < s.length(); i++) {
            Integer qty = map.get(s.charAt(i));
            if (qty == 1)
                map.remove(s.charAt(i));
            else
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        }

        return map.keySet().iterator().next();
    }

    public char findTheDifferenceXOR(String s, String t) {
        char res = t.charAt(s.length());
        for (int i = 0; i < s.length(); i++) {
            res^=s.charAt(i);
            res^=t.charAt(i);
        }
        return res;
    }
}
