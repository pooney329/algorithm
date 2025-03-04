package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1932 {

    static int[][] numbers;
    static int[][] dp;
    static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        numbers = new int[count][count];
        dp = new int[count][count];

        StringTokenizer st;
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < count; j++) {
                if (st.hasMoreTokens()) {
                    numbers[i][j] = Integer.parseInt(st.nextToken());
                } else {
                    numbers[i][j] = -1;
                }
            }
        }
        dp[0][0] = numbers[0][0];
        for(int i = 0; i<count; i++){
            MAX = Math.max(recursive(count - 1, i), MAX);
        }
        System.out.println(MAX);
    }

    public static int recursive(int row, int col) {
        if(row == -1 || col == -1) return 0;
        if(dp[row][col] == 0) {
            dp[row][col] = Math.max(recursive(row -1, col) , recursive(row-1, col -1)) + numbers[row][col];
        }
        return dp[row][col];
    }
}
