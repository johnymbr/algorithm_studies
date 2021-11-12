public class BasicCalculator {
    private int index = 0;

    public int calculate(String s) {
        int sum = 0;
        int sign = 1;

        while (index < s.length()) {
            char c = s.charAt(index++);

            if (Character.isDigit(c)) {
                int op = (c - '0');
                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                    op = op * 10 + (s.charAt(index) - '0');
                    index++;
                }

                sum += sign * op;
            } else if(c == '+') {
                sign = 1;
            } else if(c == '-') {
                sign = -1;
            } else if(c == '(') {
                sum += sign * calculate(s);
            } else if( c == ')') {
                return sum;
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        bc.calculate("1 + 1");
    }
}
