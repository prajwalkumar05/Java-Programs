package Sorting;
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
      
        
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
            
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
       
    }
}
