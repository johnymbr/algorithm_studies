import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ContagemCaracteres {

    public static void main(String[] args) {
        ContagemCaracteres cc = new ContagemCaracteres();
        System.out.println(cc.count("Paulo Cesar"));
    }

    public Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        return map;
    }
}
