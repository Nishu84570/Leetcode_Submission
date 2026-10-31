class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        
        int i = 0;
        int j = 0;

        int s_length = 0;

        while(i < s.length() && j < t.length()){
            int posOfs = s.charAt(i);
            int posOft = t.charAt(j);

            if(posOfs == posOft){
                s_length++;
                i++;
            }

            if(s_length == s.length()){
                return true;
            }

            j++;
        }

        return false;
    }
}