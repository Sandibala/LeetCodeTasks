package LeetCodeTasksEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        Map<Character, Character> backets = new HashMap<>();
        backets.put(')', '(');
        backets.put('}', '{');
        backets.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!backets.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top!=backets.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
