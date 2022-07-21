class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int count;
        int ans[] = new int[n];
       // ArrayList<Integer> l = new ArrayList<>(n);
        for(int i = 0;i<n;i++)
        {
            count =0;
            for(int j = 0;j<n;j++)
            {
                if(nums[j] < nums[i] )
                {
                    count++;
                   
                }
                 
            }
            ans[i] = count;
        }
        return ans;
    }
}