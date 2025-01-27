package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/10870}
 */
class Problem10870 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(num));
    }


    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
