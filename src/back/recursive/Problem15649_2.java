package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/15649}
 */
public class Problem15649_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] answer = new int[M];
        boolean[] visited = new boolean[N + 1];
        recursive(N,M,visited, 0,answer);
    }


    public static void recursive(int N, int M, boolean[] visited, int depth, int[] answer) {
        if(answer.length == depth) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<answer.length; i++){
                if(i==0){
                    sb.append(answer[i]);
                }
                else {
                    sb.append(" ").append(answer[i]);
                }
            }
            System.out.println(sb);
            return;
        }
        for(int i=1; i<=N; i++){
            if(!visited[i]) {
                visited[i] = true;
                answer[depth] = i;
                recursive(N, M, visited, depth + 1, answer);
                visited[i] = false;
            }
        }
    }
}
