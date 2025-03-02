package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/1912}
 */
public class Problem1912 {
    static long[] numbers = new long[100];
    static Long [] dp = new Long[100];
    static long MAX = Long.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        numbers = new long[count];
        dp = new Long[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = numbers[0];
        MAX = numbers[0];
        recursive(count - 1);
        System.out.println(MAX);
    }


    public static long recursive(int n) {


        if(dp[n] == null){
            dp[n] = Math.max(recursive(n -1) + numbers[n], numbers[n]);

            MAX = Math.max(dp[n], MAX);
        }
        return dp[n];
    }


}
