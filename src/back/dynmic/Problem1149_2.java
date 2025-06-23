package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1149_2 {
    static int[][] array;
    static int[][] dp;

    static int RED = 0;
    static int GREEN = 1;
    static int BLUE = 2;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        array = new int[count][3];
        dp = new int[count][3];
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][RED] = array[0][RED];
        dp[0][GREEN] = array[0][GREEN];
        dp[0][BLUE] = array[0][BLUE];
        System.out.println(Math.min(recursive(count - 1,RED), Math.min(recursive(count - 1,GREEN), recursive(count - 1,BLUE))));
    }


    public static int recursive(int index, int color) {
        if (dp[index][color] == 0) {
            if (color == RED) {
                dp[index][color] = Math.min(recursive(index - 1, GREEN), recursive(index - 1, BLUE)) + array[index][RED];
            } else if (color == GREEN) {
                dp[index][color] = Math.min(recursive(index - 1, RED), recursive(index - 1, BLUE)) + array[index][GREEN];
            } else {
                dp[index][color] = Math.min(recursive(index - 1, GREEN), recursive(index - 1, RED)) + array[index][BLUE];

            }
        }
        return dp[index][color];
    }
}
