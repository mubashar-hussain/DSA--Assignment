import java.util.*;
public class ParenthesesMatch {
    public static void main(String arh[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression");
    String st = sc.nextLine();
    Stack<Character> stack = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            }
            else if (ch == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            }
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            }
        }

        // Final validation
        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        /*INPUT
        [{(])}
        OUTPUT
        INVALID

         */
        /*
        INPUT
        [{([])}]
        OUTPUT
        VALID
         */


    }
}
