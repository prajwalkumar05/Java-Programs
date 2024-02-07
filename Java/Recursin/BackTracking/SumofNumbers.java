
class Program3 {
    public void rec1(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        rec1(i - 1, sum + i);

    }
}

public class SumofNumbers {
    public static void main(String[] args) {
        Program3 pg = new Program3();
        int sum = 0;
        pg.rec1(4, sum);

    }
}