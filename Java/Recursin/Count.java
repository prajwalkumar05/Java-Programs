
import java.util.*;

class Program {
    public void rec(int i, int n) {
        if (i > n) {
            return ;
        }

        System.out.println(i);
        rec(i + 1, n);
    }
}

public class Count {
    public static void main(String[] args) {
        Program pg1 = new Program();
        int n = 4;
        pg1.rec(0, n);
    }
}
