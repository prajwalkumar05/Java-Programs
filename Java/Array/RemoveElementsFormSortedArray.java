
public class RemoveElementsFormSortedArray {
     public static void main(String[] args) {


        int[] nums = {1,1,3,3,5, 4, };
        int length = removeDuplicates(nums);


        System.out.println("Length of modified array: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int j = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    
}

