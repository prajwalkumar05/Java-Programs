public class InsertionSort {

    public static void main(String[] args){
        int[] arr= {10,25,5,55,28};

        for(int i=0;i<=arr.length - 1;i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i=0;i<=arr.length -1;i++){
            System.out.println(arr[i]);
        }
    }
}
