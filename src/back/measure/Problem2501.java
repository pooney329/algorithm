package back.measure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/2501}
 */
public class Problem2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int target = 0;
        for(int i=1; i<=N; i++){
            if(N % i == 0){
                K--;
            }
            if(K == 0) {
                target = i;
                break;
            }
        }
        System.out.println(target);
    }
}
