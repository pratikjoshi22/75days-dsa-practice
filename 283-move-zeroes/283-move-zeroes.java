class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0,j=0;
        while(j<n)
        {
            if(nums[j]==0)
            {
                j++;
            }
            else
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }
//         int count = 0;  // Count of non-zero elements
 
//         // Traverse the array. If element encountered is
//         // non-zero, then replace the element at index 'count'
//         // with this element
//         for (int i = 0; i < n; i++)
//             if (nums[i] != 0)
//                 nums[count++] = nums[i]; // here count is
//                                        // incremented
 
//         // Now all non-zero elements have been shifted to
//         // front and 'count' is set as index of first 0.
//         // Make all elements 0 from count to end.
//         while (count < n)
//             nums[count++] = 0;
// //         for(int i=0;i<n;i++)
// //         {
// //             System.out.print(nums[i]+" ");
// //         }
        
        
        
    }
}