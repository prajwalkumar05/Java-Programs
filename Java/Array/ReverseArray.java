public class ReverseArray {
    public static void main (String[] args){
        int[] arr = {10,25,30,45,10};

        System.out.print("hello");
        int low=0;
        int high = arr.length-1;

        while(low<=high){
            System.out.println("hello");
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        for(int i=0;i<=arr.length -1 ;i++){
            System.out.println(arr[i]);
        }
    }
}
