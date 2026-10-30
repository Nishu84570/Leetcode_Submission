class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_one = 0;
        int curr_one = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                curr_one++;
            }

            else{
                curr_one = 0;
            }

            if(curr_one > max_one){
                max_one = curr_one;
            }
        }

        return max_one;
    }
}