class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length < k){
            return 0;
        }

        double win_sum = 0;

        for(int i = 0; i<k; i++){
            win_sum += nums[i];
        }

        double max_sum = win_sum;

        for(int i = 0; i<nums.length-k; i++){
            win_sum = win_sum - nums[i] + nums[i+k];
            
            if(win_sum > max_sum){
                max_sum = win_sum;
            }
        }

        return max_sum / k;
    }
}