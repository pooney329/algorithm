package back;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;

public class Stack4949 {

    private final String FINISHED_MARK = ".";

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals(FINISHED_MARK)) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            char[] splitArray = input.toCharArray();
            for (char c : splitArray) {
                if(c == '(' || c == '[') {
                    stack.add(c);
                }
                else if(c == ')' || c == ']'){

                    if(!stack.isEmpty()){
                        Character peekV = stack.peek();
                        if((c == ')' && peekV == '(') || (c == ']' && peekV == '[')){
                            stack.pop();
                        }
                        else {
                            stack.add(c);
                            break;
                        }
                    }
                    else {
                        stack.add(c);
                        break;
                    }
                }


            }
            br.close();
            System.out.println(stack.size() == 0 ? "yes" : "no");
        }
    }
}
