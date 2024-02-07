import java.util.*;

class Program1 {
    public void rec(int i,int n) {
        if(i<=0){
            return;
        }
        System.out.println(i);
        rec(i-1,n);
    }
}

public class NToOne {
    public static void main(String[] args) {
        Program1 pg1 = new Program1();
        
        int n=3;
        int i = n;
        pg1.rec(i,n);
    }
}
