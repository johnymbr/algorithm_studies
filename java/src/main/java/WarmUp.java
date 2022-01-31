public class WarmUp {

    public static void main(String[] args) {
        WarmUp wu = new WarmUp();
//        System.out.println(wu.nextPrime(2315647));
        System.out.println(wu.isPrime(11));
    }

    public Integer nextPrime(Integer num) {
        for (int i = num + 1;; i ++) {
            if (isPrime(i)) return i;
        }
    }

    public boolean isPrime(Integer num) {
        if (num % 2 == 0) return false;

        for (int i = 3; i < num / 2; i+=2) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
