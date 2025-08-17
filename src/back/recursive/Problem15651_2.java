package back.recursive;

import java.io.*;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/15651}
 */
public class Problem15651_2 {
    static int [] out;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        out = new int[M];
        recursive(0);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
    }

    public static void recursive(int depth){
         if(depth == M) {
             for(int i=0; i<out.length; i++){
                 if(i == 0){
                     sb.append(out[i]);
                 }
                 else{
                     sb
                             .append(" ")
                             .append(out[i]);
                 }
             }
             sb.append("\n");
             return;
         }
         for(int i = 1; i <= N; i++){
             out[depth] = i;
             recursive(depth +1);
         }
    }
}
