package back.sum;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  {@link https://www.acmicpc.net/problem/2559}
 */
public class Problem2559 {

    static int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalCount = Integer.parseInt(st.nextToken());
        int sumCount = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());





        int[] array = new int[totalCount];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }


        for(int i=0; i < array.length - sumCount + 1; i++){
            int sum = 0;
            for(int j=i; j < i + sumCount; j++) {
                sum += array[j];
            }
            MAX = Math.max( MAX, sum);
        }
        System.out.println(MAX);


    }
}
