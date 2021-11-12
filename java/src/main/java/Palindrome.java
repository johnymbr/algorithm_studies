public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x == 0) return true;

        if (x < 0 || x % 10 == 0) return false;

        int out = 0;
        int toR = x;
        while (toR != 0) {
            out = out * 10 + toR % 10;
            toR = toR / 10;
        }

        return out == x;
    }
}
