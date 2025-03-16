package back.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/25305}
 */
public class Problem25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        System.out.println(array[N-K]);    }
}
