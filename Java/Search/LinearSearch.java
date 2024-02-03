public class LinearSearch {
    public static void main(String args[]) {
        int[] arr = {10,25,35,45,62,14};

        int key=35;


        for(int i=0;i<=arr.length - 1;i++){
            if(arr[i] == key){
                System.out.println(i);
            }
        }
    }
}
