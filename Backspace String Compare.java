// 844. Backspace String Compare
// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.



class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!stack1.isEmpty() && c =='#') stack1.pop();
            else{
                if(c!='#') 
                    stack1.push(c);

             }
        }

        for(int i=0;i<t.length();i++){
            char d= t.charAt(i);
            if(!stack2.isEmpty() && d=='#') stack2.pop();
           else{
                if(d!='#') 
                    stack2.push(d);

             }
        }      
        return stack1.equals(stack2);
    }
}
