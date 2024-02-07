public class PrimeNumber {

    public static void main(String[] args) {
        int n = 15;

        for (int i = 1; i < n; i++) {

            boolean flag = false;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag = true;
                }

            }
            if (flag == false) {
                System.out.println(i);
            }

        }
    }

}
