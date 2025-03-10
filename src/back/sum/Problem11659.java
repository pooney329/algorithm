package back.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  {@link https://www.acmicpc.net/problem/11659}
 */
public class Problem11659 {

    static long[] array;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        array = new long[N + 1];
        dp = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            array[i] = Integer.parseInt(st.nextToken());
            dp[i] = dp[i-1] + array[i];
        }

        while(M --> 0){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) ;
            int end = Integer.parseInt(st.nextToken());
            System.out.println(sum(start, end));
        }

    }

    public static long sum(int start, int end){

        long sum = dp[end];
        long minus = 0;
        for(int i = 0; i <start; i++){
            minus += array[i];
        }
        return sum - minus;
    }
}
