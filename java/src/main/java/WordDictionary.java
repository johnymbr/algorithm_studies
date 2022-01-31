import java.util.HashMap;
import java.util.Map;

public class WordDictionary {
    boolean isWord = false;
    Map<Character, WordDictionary> letters;

    public WordDictionary() {
        letters = new HashMap<>();
    }

    public void addWord(String word) {
        if (word == null) return;

        if (word.length() > 0) {
            Character c = word.charAt(0);
            if (!letters.containsKey(c)) {
                letters.put(c, new WordDictionary());
            }
            letters.get(c).addWord(word.substring(1));
        } else {
            isWord = true;
        }
    }

    public boolean search(String word) {
        if (word == null) return false;

        if (word.length() == 0) return isWord;

        Character c = word.charAt(0);
        if (!c.equals('.')) {
            if (!letters.containsKey(c)) return false;

            return letters.get(c).search(word.substring(1));
        } else {
            for (WordDictionary wd : letters.values()) {
                if (wd.search(word.substring(1))) return true;
            }
        }
        return false;
    }
}
