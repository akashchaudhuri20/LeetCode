import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

*/

public class ValidParentheses {

    public static void main(String args[]) {
        String inputStringOne = "()"; // true
        String inputStringTwo = "(){}[]"; // true
        String inputStringThree = "(]"; // false
        String inputStringFour = "([])"; // true
        String inputStringFive = "([)]"; // false
        String inputStringSix = "[{()}]"; // true
        String inputStringSeven = "]})"; // false
        String inputStringEight = "(){"; // false
        System.out.println(isValid(inputStringOne));
        System.out.println(isValid(inputStringTwo));
        System.out.println(isValid(inputStringThree));
        System.out.println(isValid(inputStringFour));
        System.out.println(isValid(inputStringFive));
        System.out.println(isValid(inputStringSix));
        System.out.println(isValid(inputStringSeven));
        System.out.println(isValid(inputStringEight));
    }

    private static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else if (!stack.pop().equals(bracketMap.get(c))) return false;
            }
        }
        return stack.isEmpty();
    }

}