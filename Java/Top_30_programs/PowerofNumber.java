
class PowerofNumber {
    public static void main(String args[]) {
        int base = 2;
        int exponent = 8;

        int result = base;

        for (int i = 0; i < exponent - 1; i++) {
            result = result * base;
        }

        System.out.println(result);

    }
}
