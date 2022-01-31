import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagrama {

    public static void main(String[] args) {
        Anagrama a = new Anagrama();
        System.out.println(a.ehAnagrama("casa", "saco"));
    }

    public boolean ehAnagrama(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> mapCount = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            if (mapCount.containsKey(c)) {
                mapCount.put(c, mapCount.get(c) + 1);
            } else {
                mapCount.put(c, 1);
            }
        }

        for (int j = 0; j < str2.length(); j++) {
            Character c = str2.charAt(j);
            if (!mapCount.containsKey(c)) return false;

            mapCount.put(c, mapCount.get(c) - 1);
        }

        for (Integer count : mapCount.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}
