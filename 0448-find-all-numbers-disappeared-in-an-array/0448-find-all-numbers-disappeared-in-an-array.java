class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;

        while(i < nums.length){
            int corr_index = nums[i] - 1;

            if(nums[i] != nums[corr_index]){
                int tem = nums[i];
                nums[i] = nums[corr_index];
                nums[corr_index] = tem;
            }

            else{
                i++;
            }
        }

        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
                list.add(j + 1);
            }
        }

        return list;
    }
}