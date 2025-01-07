package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/10872}
 */
public class Problem10872 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recursive(N));
    }

    public int recursive(int num) {
        if (num <= 1) return 1;
        return num * recursive(num - 1);
    }
}

