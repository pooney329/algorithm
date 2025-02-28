package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
예제 입력 1
10
10 -4 3 1 5 6 -35 12 21 -1
예제 출력 1
33
예제 입력 2
10
2 1 -4 3 4 -4 6 5 -5 1
예제 출력 2
14
예제 입력 3
5
-1 -2 -3 -4 -5
예제 출력 3
-1
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
