import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.add(c);    
            }
            else{
                if(stack.isEmpty()){
                    stack.add(c);
                }
            }
            
            if( c == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.add(c);
                }
            } 
            
            if( c == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    stack.add(c);
                }
            } 
            
            if( c == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                }
                else{
                    stack.add(c);
                }
            } 
        }
        
        if(stack.isEmpty())
            return true;
        else
            return false;
        
    }
}