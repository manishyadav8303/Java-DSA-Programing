import java.util.Stack;

public class duplicateparenthesis {

    public static boolean dup(String str) {

        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == ')') {

                int count = 0;

                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // Remove '('
                s.pop();

                // Nothing between ( )
                if(count == 0) {
                    return true;
                }

            } else {

                // Push everything except ')'
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "(a+b)";
        System.out.println(dup(str));
    }
}