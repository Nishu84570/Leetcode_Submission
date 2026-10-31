class Solution {
    public int pivotInteger(int n) {
        int sum = (n * (n + 1)) / 2;

        int i = 1;
        int j = n;

        while(i <= j){
            int mid = i + (j - i)/2;

            if(mid * mid == sum){
                return mid;
            }

            else if(mid * mid < sum){
                i = mid + 1;
            }

            else{
                j = mid - 1;
            }
        }

        return -1;
    }
}