class Solution {
    public int mostWordsFound(String[] s) {
        int count =0;
        int ans  = 0;
        for(int i=0;i<s.length;i++)
        {
            String st= s[i];
            String temp="";
            // System.out.println(st[0]);
            count  = 0;
            for(int j=0;j<st.length();j++)
            {
                if(st.charAt(j) == ' ' ||  j == st.length()-1){
                    // System.out.println(temp);
                    count++;
                    // temp = "";
                    
                }
                // else{
                    // temp+=st.charAt(j);
                    // System.out.println(st.charAt(j));
                // }
            }
            // int l = s.length;
        ans = Math.max(count,ans);

        }
        return ans;
    }
}