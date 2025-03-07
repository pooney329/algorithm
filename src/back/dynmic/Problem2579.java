package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 6
 *
 * 6
 * 10
 * 20
 * 15
 * 25
 * 10
 * 20
 *
 *
 *
 * == 75
 *
 *
 * 부터 첫 번째, 두 번째, 네 번째, 여섯 번째 계단을 밟아 도착점에 도달하면 총 점수는 10 + 20 + 25 + 20 = 75점이 된다.
 */
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
        dp[2] = Math.max(dp[0], dp[1]);
        dp[3] = Math.max(dp[0] + numberArray[2] , dp[0] + numberArray[1]) + numberArray[3];

        System.out.println(recursive(count - 1));
    }


    public static int recursive(int n){
        System.out.println("n : " + n);
        if(n < 0) return 0;
       if(dp[n] == 0) {
           dp[n] = Math.max(recursive(n-3) + numberArray[n-1] , recursive(n-3) + numberArray[n-2]) + numberArray[n];
       }
       return dp[n];
    }

}
