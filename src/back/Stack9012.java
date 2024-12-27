package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Stack9012 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int totalCount = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();
        for (int i = 1; i <= totalCount; i++) {
            char[] psArray = br.readLine().toCharArray();
            for (char ps : psArray) {
                if (stack.isEmpty()) {
                    stack.add(ps);
                } else {
                    char peek = stack.peek();
                    if (peek == ps) {
                        stack.pop();
                        continue;
                    }
                    stack.add(ps);
                }
            }
            System.out.println(stack.isEmpty() ? "YES" : "NO");
            stack.clear();
        }
        br.close();
    }
}
