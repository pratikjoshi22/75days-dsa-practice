// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        long min = a[0],max=a[0];
        pair minmax = new pair(min,max);

        if(n==1)
        {
            minmax.second = a[0];
            minmax.first = a[1];
        }
        if(a[0] > a[1])
        {
            minmax.second = a[0];
            minmax.first = a[1];
            
        }
        else
        {
            minmax.second = a[1];
            minmax.first = a[0];
        }
        
        for(int i = 2; i < n; i++)
        {
            if(a[i]>minmax.second)
            {
                minmax.second = a[i];
                
            }
            else if(a[i] < minmax.first)
            {
                minmax.first = a[i];
            }
            
        }
        return minmax;
    }
}
