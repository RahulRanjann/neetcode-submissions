import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> expectedNums = new ArrayList<>();
        expectedNums.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > expectedNums.get(expectedNums.size() - 1)) {
                expectedNums.add(nums[i]);
            }
        }
        return expectedNums.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }
}