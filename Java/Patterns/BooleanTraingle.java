public class BooleanTraingle {
    public static void main(String args[]){

        int val=1;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(val == 1){
                    System.out.print(val);
                    System.out.print(" ");
                    val--;
                }
                else{
                  System.out.print(val);
                  System.out.print(" ");
                    val++;  
                }
                

            }
            System.out.println();
        }
    }
}
