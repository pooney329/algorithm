package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem14889 {

    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        StringTokenizer st;

        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
