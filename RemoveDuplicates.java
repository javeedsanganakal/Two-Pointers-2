

// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// count  = 1
// 2 Pointers slow and Fast or i  starts at index 1
// If fast or current and (fast -1) or previous number both are same increment the count ; else reset count =1;
// if count <= targetCount, Overwrite the nums[fast] with nums[slow] , slow ++

//finally return  the slow



// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int count = 1;
        int slow = 1;
        
    for(int i = 1; i < nums.length; i++){
        
         // Duplicates count
        if(nums[i] == nums[i-1]){
            count++;
        }
        else{
            count = 1;
        }
        
        // Over write the numbers
        if(count <= 2){
            nums[slow] = nums[i];
            slow++;
        }
      }
        return slow;
    }
}