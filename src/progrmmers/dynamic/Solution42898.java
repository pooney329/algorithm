package progrmmers.dynamic;

/**
 import java.util.LinkedList;
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42898}
 */
public class Solution42898 {
    public static void main(String[] args) {
        Solution42898 Solution42898 = new Solution42898();
        int m = 4, n = 3, puddles[][] = {{2, 2}};
        System.out.println(Solution42898.solution(m, n, puddles));
    }
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1_000_000_007;
        int[][] dp = new int[n + 1][m + 1];
        //웅덩이 표시
        for(int[] p : puddles){
            dp[p[1]][p[0]] = -1;
        }

        dp[1][1] = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(dp[i][j] == -1) {
                    continue;
                }
                if(dp[i-1][j] > 0) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j]) % mod;
                }

                if(dp[i][j-1] > 0) {
                    dp[i][j] = (dp[i][j] + dp[i][j-1]) % mod;
                }
            }
        }
        return dp[n][m];

    }



}
