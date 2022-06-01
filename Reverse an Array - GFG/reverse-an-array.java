/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    
    // public static void revArray(int arr[],int s,int e)
    // {
    //         int temp;
		  //  while(s<e)
		  //  {
		        
		  //      temp=arr[s];
		  //      arr[s]=arr[e];
		  //      arr[e]=temp;
		  //      s++;
		  //      e--;
		  //  }
    // }
    // public static void printArray(int arr[],int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println("");
    // }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		
		for(int i=0;i<t;i++)
		{
		    int n = sc.nextInt();
		    int arr[]=new int[n];
		   
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    int temp;
		    int s=0;
		    int e=n-1;
		    while(s<e)
		    {
		        
		        temp=arr[s];
		        arr[s]=arr[e];
		        arr[e]=temp;
		        s++;
		        e--;
		    }
		 for(int a=0;a<n;a++)
         {
             System.out.print(arr[a]+" ");
         }
         System.out.println("");
		   
		 
		  
		}
		    
	}
}