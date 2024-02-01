class Fibonacci {
    public static void main(String args[]) {
        int n = 100;

        int a = 1;
        int b = 2;

        int c = 0;

        while (c <= n) {
            c = a + b;
            if (c <= n) {
                System.out.println(c);
            }
            a = b;
            b = c;
        }
    }
}
