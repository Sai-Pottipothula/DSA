class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            switch (s) {
                case "+": {
                    int b = st.pop(), a = st.pop();
                    st.push(a + b);
                    break;
                }
                case "-": {
                    int b = st.pop(), a = st.pop();
                    st.push(a - b);
                    break;
                }
                case "*": {
                    int b = st.pop(), a = st.pop();
                    st.push(a * b);
                    break;
                }
                case "/": {
                    int b = st.pop(), a = st.pop();
                    st.push(a / b); // integer division
                    break;
                }
                default: // number
                    st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}