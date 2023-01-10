class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for(int i = 0; i < nums.length; i++) totalSum = totalSum+nums[i];
        for(int i = 0; i < nums.length; i++){
            if(totalSum-nums[i] == 2 * leftSum) return i;
            leftSum+=nums[i];   
        }
        return -1;
    }
}