class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();

        int i = 0;
        int j = 1;

        while(i < target.length && j <= n){
            if(target[i] == j){
                list.add("Push");
                i++;
                j++;
            }

            else{
                list.add("Push");
                list.add("Pop");
                j++;
            }
        }

        return list;
    }
}