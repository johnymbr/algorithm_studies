public class AddDigits {
    public int addDigits(int num) {
        while (num > 9) {
            int aux1 = num / 10;
            int rest = num % 10;
            num = aux1 + rest;
        }

        return num;
    }
}
