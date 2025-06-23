package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1912_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        Integer[] dp = new Integer[count];
        int[] array = new int[count];

        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = array[0];
        MAX = dp[0];
        recursive(array,dp,count -1 );
        System.out.println(MAX);
    }
    static int MAX = 0;
    public static int recursive(int[] array, Integer[] dp, int index) {
        if(dp[index] == null){
            int dpMax = Math.max(recursive(array, dp, index - 1) + array[index], array[index]);
            dp[index] = dpMax;
            MAX = Math.max(dpMax, MAX);
        }
        return dp[index];
    }
}
