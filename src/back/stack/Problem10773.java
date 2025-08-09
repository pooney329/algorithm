package back.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Problem10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCommand = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while(totalCommand --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            if(number == 0) {
                stack.pop();
            }
            else {
                stack.add(number);
            }
        }

        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }




}
