
import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        // Missing number is 0
        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                return nums[i] + 1;
            }
        }

        // Missing number is the last number
        return nums.length;
    }
}
 missingno {
    
}
