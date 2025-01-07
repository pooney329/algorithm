package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/24723}
 */
public class Problem24723 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final Integer N = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2,N));

    }
}
