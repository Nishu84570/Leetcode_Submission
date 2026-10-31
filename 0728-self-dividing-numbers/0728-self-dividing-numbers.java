class Solution {
    boolean isdivide(int n){
        if(n % 10 == 0){
            return false;
        }

        int original = n;

        while(n > 0){
            int rem = n % 10;

            if(rem == 0 || original % rem != 0){
                return false;
            }

            n /= 10;
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i = left; i<=right; i++){
            int original = i;

            if(isdivide(i)){
                list.add(original);
            }
        }

        return list;
    }
}