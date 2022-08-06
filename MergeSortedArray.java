// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: 


//1. Both are must be sorted  Arrays.
//2. 2 pointers p1, p2 and for replacing numbers we are using idx
//3. p1 is greater or equal to p2 move at idx and then p1-- and idx--;
//4. p2 is greater move at idx and then p2- and idx--
//3. if p1 goes out of bound, and then p2-- and idx -- 

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while( p1 >= 0 && p2 >= 0){
            if(nums1[p1] >= nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }
            else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        //if p1 goes out of bound
        while(p2 >= 0){
            nums1[idx] = nums2[p2];
                p2--;
                idx--;
        }
        
    }
}