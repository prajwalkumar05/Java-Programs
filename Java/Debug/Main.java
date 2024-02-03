import java.util.Arrays;

class Main {

    public static void main(String argss[]) {

        int[] nums = {5,1,2,3,1,2,1,5,5};

    
        Arrays.sort(nums);
        int n = nums.length;
        int result =  nums[n/2];

        System.out.println(result);
    

    }

}
