class Reverse {
    public static void main(String args[]) {
        int n = 123;
        int temp=n;
        int rev = 0;

        int rem=0;

        while(temp != 0){
            rem=temp % 10;
            System.out.println(rem);
            rev = rev * 10 + rem;
            System.out.println(rev);
            temp=temp / 10;
            System.out.println(temp);

        }

        System.out.println(rev);
    }
}
