class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans=0;
        
        for(int i = 0;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                ans = Math.max(ans,(nums[i]-1)*(nums[j]-1));     
            }
          
        }
        return ans;
    }
}