public class ReverseAString {
    public static void main(String[] args) {
        String name = "prajwal";
        String rev = "";

        for (int i = 0; i <= name.length() - 1; i++) {
            rev = name.charAt(i) + rev;
        }

        System.out.println(rev);
    }
}
