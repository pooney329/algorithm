package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2579 {

    static int[] numberArray;
    static int[] dp;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        numberArray = new int[count];
        dp = new int[count];
        visited = new boolean[count];

        for (int i = 0; i < count; i++) {
            numberArray[i] = Integer.parseInt(br.readLine());
        }


        dp[0] = numberArray[0];
        dp[1] = numberArray[1];
        dp[2] = Math.max(dp[0],dp[1]) + numberArray[2];

        System.out.println(recursive(count - 1));
    }


    public static int recursive(int n){
        if(n <= 0 || visited[n]) return 0;
        if(dp[n] == 0){
            visited[n] = true;
            dp[n] = Math.max(recursive(n-3) +  recursive(n-1), recursive(n-2 ) + recursive(n-3)) + numberArray[n];
        }
        return dp[n];
    }

}
