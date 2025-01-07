import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/15439}
 */

public class Main {

    public static class Problem24723 {

        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            final Integer N = Integer.parseInt(br.readLine());
            System.out.println((int)Math.pow(2,N));

        }
    }


    public static void main(String[] args) throws IOException {
        Problem24723 problem = new Problem24723();
        problem.solution();
    }
}

