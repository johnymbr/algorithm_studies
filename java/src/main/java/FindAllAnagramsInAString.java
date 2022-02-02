import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (s.length() < p.length()) return ret;

        Integer sLength = s.length();
        Integer pLength  = p.length() - 1;
        for (int i = 0; i < sLength; i++) {
            if ((i + pLength) <= sLength) {

            }
        }
        return ret;
    }
}
