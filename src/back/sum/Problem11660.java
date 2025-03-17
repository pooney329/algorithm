package back.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/11660}
 */
public class Problem11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] array = new int[N + 1][N + 1];
        int[][] sumArray = new int[N + 1][N + 1];
        for(int i= 1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                sumArray[i][j] = sumArray[i][j - 1] + array[i][j];
            }
        }

        for(int i=0; i < M; i++){
            String[] numArray = br.readLine().split(" ");
            int a = Integer.parseInt(numArray[0]);
            int b = Integer.parseInt(numArray[1]);
            int c = Integer.parseInt(numArray[2]);
            int d = Integer.parseInt(numArray[3]);
            int sum = 0;
            for(int j = a; j <= c; j++){
                sum += sumArray[j][d] - sumArray[j][b-1];
            }

            System.out.println(sum);
        }
    }
}
