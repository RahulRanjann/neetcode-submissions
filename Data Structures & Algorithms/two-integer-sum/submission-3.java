class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        int temp;
        for(int i = 0; i<nums.length; i++){
            m.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            temp = target-nums[i];
            
            if(m.containsKey(temp) && i!=m.get(temp))
            {
                    result[0]=i;
                    result[1]=m.get(temp);
                    break;
            }
        }
        return result;
    }
}
