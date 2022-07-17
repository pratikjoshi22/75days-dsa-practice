class Solution {
    public int finalValueAfterOperations(String[] s) {
        
        int ans = 0;
        for(int i = 0 ;i<s.length;i++ )
        {
            String str= s[i];
            // System.out.println(s[i]);
            if(str.charAt(1)=='+')
            {
                ans++;
            }
            else
            {
                ans--;
            }
        }
        
        return ans;
    }
}