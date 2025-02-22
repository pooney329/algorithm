package back.twoarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2566 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = 9;
        int M = 9;

        int MAX = 0;
        int a = 0, b = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                int n = Integer.parseInt(st.nextToken());
                if(MAX < n){
                     MAX = n;
                     a = i;
                     b = j;
                 }
            }
         }

        StringBuilder sb = new StringBuilder();
        sb.append(MAX)
                .append("\n")
                .append(a + 1).append(" ").append(b + 1);

        System.out.println(sb);


    }
}
