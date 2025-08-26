package back.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * {@link https://www.acmicpc.net/problem/9012}
 */
public class Problem9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        while(count > 0) {
            count--;
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            String result = "YES";
            for(char c : input.toCharArray()) {
                if(c == '(') {
                    stack.push(c);
                } else if(c == ')') {
                    if(stack.isEmpty()) {
                        result = "NO";
                        break;
                    } else {
                        if(stack.pop() != '(') {
                            result = "NO";
                            break;
                        };
                    }
                }
            }

            System.out.println(!stack.isEmpty() ? "NO" : result);
        }
    }
}
