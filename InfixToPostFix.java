import java.util.Stack;
public class InfixToPostFix {
    public static String infixToPostfix(String exp) {
        StringBuilder post = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c: exp.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                post.append(c);
            } else if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                while(!stack.isEmpty() && stack.peek()!= '(') {
                    post.append(stack.pop());
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    post.append(stack.pop());
                }
                stack.push(c);
            } 
            }
            while(!stack.isEmpty()) {
                post.append(stack.pop());
            }
            return post.toString();
        }
        public static int precedence(char operator) {
            switch (operator) {
                case '+':
                case '-': 
                return 1;
                case '*':
                case '/': 
                return 2;
                default:
                    return -1;
            }
        }
        public static void main(String[] args) {
            String infy = "(5*4+3*)-1";
            System.out.println("Infix   : "+infy);
            System.out.println("Postfix : "+infixToPostfix(infy));
        }
}
