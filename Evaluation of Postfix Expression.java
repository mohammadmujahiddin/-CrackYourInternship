Difficulty: EasyAccuracy: 63.04%Submissions: 84K+Points: 2
Given string S representing a postfix expression, the task is to evaluate the expression and find the final value. 
Operators will only include the basic arithmetic operators like *, /, + and -.

class Solution{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        
        for(char c: S.toCharArray()){
            if(Character.isDigit(c)){
                int in = (int)(c - '0');
                st.push(in);
            }else{
                if(c == '+'){
                    int n1 = st.pop();
                    int n2 = st.pop();
                    st.push(n2 + n1);
                }else if(c == '-'){
                    int n1 = st.pop();
                    int n2 = st.pop();
                    st.push(n2 - n1);
                }else if(c == '/'){
                    int n1 = st.pop();
                    int n2 = st.pop();
                    st.push(n2 / n1);
                }else if(c == '*'){
                    int n1 = st.pop();
                    int n2 = st.pop();
                    st.push(n2 * n1);
                }
            }
        }
        return st.pop();
    }
}
