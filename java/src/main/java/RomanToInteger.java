public class RomanToInteger {

    public int romanToInt(String s) {
        int finalNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            if (i > 0) {
                int previous = getValue(s.charAt(i - 1));
                if (previous < current) {
                    finalNumber += (current - previous * 2);
                } else {
                    finalNumber += current;
                }
            } else {
                finalNumber += current;
            }
        }

        return finalNumber;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}