import java.util.*;
public class isBalanced {
    public static boolean isBalancedParanthesis(String exp) {
        Stack<Character> stack = new Stack<>();
        for(char c: exp.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(c == '(' && top != ')' || c == '{' && top != '}' || c == '[' && top != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String exp = "[()]{}";
        System.out.println("Input : "+exp);
        System.out.println("Output : "+(isBalancedParanthesis(exp)? "Balanced":"Not Balanced"));
    }
}