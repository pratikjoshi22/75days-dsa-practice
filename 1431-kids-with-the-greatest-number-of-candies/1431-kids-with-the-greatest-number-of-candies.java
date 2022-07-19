class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int n = candies.length;
        
        List<Boolean> l = new ArrayList<>(n);
        //List<Integer> ls = Arrays.asList(candies);
        
        
        
        for(int i=0;i<n;i++)
        {
             boolean test=true;
            for(int j=0;j<n;j++)
            {
               
                int max=candies[i]+e;
                if(max<candies[j])
                {
                    test = false;
                    break;
                }
                
            }
            if(test==true)
            {
                l.add(true);
            }
            else
            {
                l.add(false);
            }
        }
        
        
        return l;
    }
}