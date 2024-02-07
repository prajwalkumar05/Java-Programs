

class Program3 {
    public void rec1(int i,int n) {

        if(i<1){
            return;
        }

        rec1(i-1,n);
        System.out.println(i);
        
    }
}

public class OneToN {
    public static void main(String[] args) {
        Program3 pg = new Program3();
        pg.rec1(4,4);
        
    }
}
