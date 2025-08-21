package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/24416}
 */
public class Problem24416_2 {
    static int k = 0;
    static int j = 0;

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        fib(n);
        fibonacci(n);
        System.out.println(k + " " + j);
    }

    public static int fib(int n){
        if(n ==1 || n == 2) {
            k++;
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fibonacci(int n){
        if(dp[n] != 0){
            return dp[n];
        }
        j++;
        dp[n] = fibonacci(n-1) + fibonacci(n-2);
        return dp[n];
    }
}
