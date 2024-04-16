import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    private Map<Character, Character> bracketMap = new HashMap<>();

    private boolean isCloser(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private boolean isMatch(char c1, char c2) {
        return bracketMap.get(c1) == c2;
    }

    public boolean isValid(String s) {
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isCloser(c)) {
                bracketStack.push(c);
            } else {
                if (bracketStack.isEmpty() || !isMatch(bracketStack.pop(), c)) {
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        Solution sln = new Solution();
        boolean result = sln.isValid(args[0]);
        System.out.println(result);
    }
}
