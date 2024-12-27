package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stack10773 {
    public void solution() throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        final int totalCount = Integer.parseInt(scanner.readLine());
        for (int i = 1; i <= totalCount; i++) {
            int inputNumber = Integer.parseInt(scanner.readLine());
            if (inputNumber == 0) {
                stack.pop();
            } else {
                stack.add(inputNumber);
            }
        }

        int sum = stack.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        scanner.close();
    }
}
