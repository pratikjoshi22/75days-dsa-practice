// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int currsum = 0, start = 1, end=0;
        
            for(int i = 0;i< arr.length;i++)
            {
                if(currsum==s)
                    break;
                currsum += arr[i];
                end++;
                
                while(currsum>s)
                {
                    currsum -= arr[start-1];
                    start++;
                }
            }
            if(currsum==s)
            {
                al.add(start);
                al.add(end);
                
            }
            else
                al.add(-1);
            
            return al;
            
            
            
            
        }
    
    }   
    
