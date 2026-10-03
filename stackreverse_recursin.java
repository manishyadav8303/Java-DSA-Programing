    import java.util.*;
public class stackreverse_recursin {

    public static void reverse(Stack<Integer> s) {

        // Base case
        if (s.isEmpty()) {
            return;
        }

        // Top element remove karo
        int top = s.pop();

        // Baaki stack reverse karo
        reverse(s);

        // Removed element ko bottom mein daalo
        insertAtBottom(s, top);
    }

    public static void insertAtBottom(Stack<Integer> s, int value) {

        // Stack empty hai → yahi bottom hai
        if (s.isEmpty()) {
            s.push(value);
            return;
        }

        // Top temporarily remove
        int top = s.pop();

        // Bottom tak jao
        insertAtBottom(s, value);

        // Removed element wapas daalo
        s.push(top);
    }
}

