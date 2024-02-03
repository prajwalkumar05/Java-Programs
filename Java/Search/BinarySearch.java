public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};

        int key=30;

        int low=0,high=arr.length - 1;

        while(low<=high){
            int mid = (high+low)/2;

            if(key == arr[mid]){
                System.out.println("The position of element"+mid);
                break;
            }

            if(key < arr[mid]){
                high = mid - 1;
            }

            if(key > arr[mid]){
                low = mid + 1;
            }
        }
    }
    
}
