package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem15439 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         final Integer N = Integer.parseInt(br.readLine());
        System.out.println(N * N-1);
    }
}
