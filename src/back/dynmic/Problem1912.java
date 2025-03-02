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
    long MAX = Long.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        numbers = new long[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        long MAX = numbers[0];

        for(int i = 1; i < count; i++ ){
            if(MAX + numbers[i] <= numbers[i]){
                MAX = numbers[i];
                continue;
            }
            MAX = MAX + numbers[i];
        }

        System.out.println(MAX);
    }






}
