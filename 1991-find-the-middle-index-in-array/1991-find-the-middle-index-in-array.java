class Solution {
    public int findMiddleIndex(int[] nums) {
        int curr_sum=0;
        int totsum = 0;
        for(int i = 0;i<nums.length;i++)
        {
            totsum += nums[i];
            
        }
        for(int i=0;i<nums.length;i++)
        {
            if(curr_sum == totsum - curr_sum - nums[i] )
            {
                return i;
            }
            curr_sum += nums[i];
        }
        return -1;
    }
}