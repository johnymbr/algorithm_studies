import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else if (!stack.isEmpty()) {
                char last = stack.pop();

                if (last == '(' && curr != ')')
                    return false;
                if (last == '{' && curr != '}')
                    return false;
                if (last == '[' && curr != ']')
                    return false;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
