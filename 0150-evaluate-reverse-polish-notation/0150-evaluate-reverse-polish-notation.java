class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<tokens.length; i++){
            if(st.isEmpty()){
                int num = Integer.valueOf(tokens[i]);
                st.push(num);
            }

            else if(tokens[i].equals("+")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = a + b;
                st.push(c);
            }

            else if(tokens[i].equals("-")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = b - a;
                st.push(c);
            }


            else if(tokens[i].equals("*")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = a * b;
                st.push(c);
            }

            else if(tokens[i].equals("/")){
                int a = st.peek();
                st.pop();

                int b = st.peek();
                st.pop();

                int c = b / a;
                st.push(c);
            }

            else{
                int num = Integer.valueOf(tokens[i]);
                st.push(num);
            }
        }

        return st.peek();
    }
}