public class StrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        StrStr strStr = new StrStr();
        System.out.println(strStr.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int hLength = haystack.length();
        int nLength = needle.length();

        for (int i = 0; i < (hLength + 1 - nLength); i++) {
            for (int j = 0; j < nLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;

                if (j == (nLength - 1)) return i;
            }
        }

        return -1;
    }
}
