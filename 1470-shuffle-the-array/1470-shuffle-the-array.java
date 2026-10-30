class Solution {
    public int[] shuffle(int[] nums, int m) {
        int n = nums.length;
        int[] arr = new int[n];

        int index = 0;
        int i = 0;
        int j = m;

        while(i < m && j < n){
            arr[index] = nums[i];
            index++;
            arr[index] = nums[j];
            index++;
            i++;
            j++;
        }

        return arr;
    }
}