import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/15439}
 */

public class Main {

    public static class Problem15439 {

        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            final Integer N = Integer.parseInt(br.readLine());
            System.out.println(N * (N - 1));
        }
    }


    public static void main(String[] args) throws IOException {
        Problem15439 problem = new Problem15439();
        problem.solution();
    }
}

