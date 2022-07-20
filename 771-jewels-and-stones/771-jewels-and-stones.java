class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int low[] = new int[26];
        int alph[] = new int[26];
        for(int i =0;i<26;i++)
        {
            low[i] = -1;
            alph[i] = -1;
            
        }
        // low[2] = 3;
        for(int i = 0;i<jewels.length();i++)
        {
            if(jewels.charAt(i)>='a' && jewels.charAt(i)<='z' )
            {
                low[jewels.charAt(i)-'a']=0;
            }
            else
            {
                alph[jewels.charAt(i)-'A']=0;
            }
                
        }
        int ans=0;
        for(int i=0;i<stones.length();i++)
        {
            // System.out.print(stones.charAt(i)-'a' + " ");
            // System.out.print(alph[0] == -1);
            // int lowcal = stones.charAt(i)-'a;
            // int alphcal = stones.charAt(i)-'A';

            // if(low[stones.charAt(i)-'a'] == 0 )//|| alph[stones.charAt(i)-'A'] == 0 )
            // {
            //     ans++;
            // }
            if(stones.charAt(i)>='a' && stones.charAt(i)<='z' )
            {
                if(low[stones.charAt(i)-'a'] == 0 )//|| alph[stones.charAt(i)-'A'] == 0 )
                {
                    ans++;
                }
            }
            else
            {
                if(alph[stones.charAt(i)-'A'] == 0 )//|| alph[stones.charAt(i)-'A'] == 0 )
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}