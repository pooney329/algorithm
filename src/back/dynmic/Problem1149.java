package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1149 {
    static int[][] rgbArray;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        rgbArray = new int[count][3];
        dp = new int[count][3];

        StringTokenizer st = null;
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                rgbArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = rgbArray[0][0];
        dp[0][1] = rgbArray[0][1];
        dp[0][2] = rgbArray[0][2];

        System.out.println(Math.min(paint(count-1,0), Math.min(paint(count-1,1), paint(count-1,2))));
    }

    public static int paint(int n , int color){

        if(dp[n][color] == 0) {
            if(color == 0){
                dp[n][color] = Math.min(paint(n-1,1), paint(n-1, 2)) + rgbArray[n][color];
            }
            else if(color == 1){
                dp[n][color] = Math.min(paint(n-1,0), paint(n-1, 2)) + rgbArray[n][color];
            }
            else {
                dp[n][color] = Math.min(paint(n-1,1), paint(n-1, 0)) + rgbArray[n][color];
            }
        }
        return dp[n][color];
    }

}
