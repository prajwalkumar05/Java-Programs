class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        
        // Find a candidate for the majority element
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        // Verify if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        // If the candidate appears more than n/2 times, it is the majority element
        if (count > nums.length / 2) {
            return candidate;
        } else {
            // No majority element found, you can return a special value or throw an exception
            // Here, we are returning -1 to indicate no majority element found
            return -1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 5, 4, 5, 2, 5, 3, 3, 5}; // Example input array
        int result = solution.majorityElement(nums);
        System.out.println("Majority element is: " + result);
    }
}
