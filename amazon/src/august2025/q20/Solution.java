package august2025.q20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        {
            String s = "()";
            boolean result = isValid(s);
            System.out.println(s+": "+result);
        }
        {
            String s = "()[]{}";
            boolean result = isValid(s);
            System.out.println(s+": "+result);
        }
        {
            String s = "(]";
            boolean result = isValid(s);
            System.out.println(s+": "+result);
        }
        {
            String s = s = "([])";
            boolean result = isValid(s);
            System.out.println(s+": "+result);
        }
        {
            String s = s = "([)]";
            boolean result = isValid(s);
            System.out.println(s+": "+result);
        }


    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            Character currentChar = s.charAt(i);

            if(map.containsValue(currentChar)){
                stack.push(currentChar);
            }else if(stack.isEmpty() || stack.peek() != map.get(currentChar)){
                return false;
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}