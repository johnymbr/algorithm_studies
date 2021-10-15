public class Permutation {

    public static void main(String[] args) {
//        Permutation permutation = new Permutation();
//        permutation.permutation("teste");


        String regex = "^A([a-zA-Z]{0,12})?$";
        if ("Astrelgdscvb".matches(regex))
            System.out.println("TRUE");
    }

    public void permutation(String str) {
        permutation(str, "");
    }

    public void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
