class Solution {
    public int pivotIndex(int[] nums) {
       
        //Arrays.sort(nums);
        int total = 0;
        int sum_till = 0;
		
		// total sum
        //for(int val: nums) total += val;
        for(int i=0;i<nums.length;i++)
        {
            total += nums[i];
        }
        for(int i=0;i<nums.length;i++) {
			// if sum till now (left sum), is equal to total - sum till now - (means right sum)
            if(sum_till == total - sum_till - nums[i]) return i;
            sum_till += nums[i];
        }
        return -1;
        
    }
}