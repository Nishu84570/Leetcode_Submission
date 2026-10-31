class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0){
            return -1;
        }
        
        int rem = 0;
        int length = 0;
        
        for(int i = 1; i<=k; i++){
            rem = (rem * 10) + 1;
            length++;

            if(rem % k == 0){
                return length;
            }

            rem = rem % k;
        }

        return -1;
    }
}