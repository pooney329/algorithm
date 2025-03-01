package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 */
public class Problem1912 {
    static long[] numbers = new long[100];
    static long[][] cache = new long[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        numbers = new long[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }


        recursive();
        System.out.println(MAX);
    }


    static long MAX = Long.MIN_VALUE;

    public static void recursive() {
        cache[0][0] = numbers[0];
        MAX = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++) {
            long sum = numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                sum += numbers[j];
                if(cache[i][j]==0){
                    cache[i][j]=sum;
                    cache[i+1][j] = sum - cache[i][j];
                }
                MAX = Math.max(MAX, cache[i][j]);
            }
        }

    }

}
