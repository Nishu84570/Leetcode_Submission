class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int[] arr = new int[n];

        int index = 0;

        for(int i = 0; i<nums.length; i++){
            arr[index] = nums[i];
            index++;
        }

        for(int i = 0; i<nums.length; i++){
            arr[index] = nums[i];
            index++;
        }

        return arr;
    }
}