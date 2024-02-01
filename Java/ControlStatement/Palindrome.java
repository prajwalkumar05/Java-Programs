public class Palindrome {

    public static void main(String[] args) {
        int x = 121; // You can change this to any number you want to test
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(x);
        System.out.println("Is the number palindrome? " + result);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
} 
