package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] input = br.readLine().split(" ");

        int [] dp = new int[count + 1];
        int result = 0;
        for(int i=1; i<=count; i++) {
            dp[i] = dp[i-1] + Integer.parseInt(input[i-1]);
            if(dp[i] % m == 0) result += 1;
            for(int j=1; j<i; j++) {
                if (dp[i] - dp[j] % m == 0) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
