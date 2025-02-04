package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @{link https://www.acmicpc.net/problem/15649}
 */
public class Problem15649 {

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N];
        boolean[] visited = new boolean[N];

        for(int i=0; i<N; i++){
            array[i] = i + 1;
        }

        backtraking(array,new int[M], visited, 0, M);
        System.out.println(sb);


    }

    public static void backtraking(int[] array, int[] out, boolean[] visited, int start, int M) {
        if(start == M) {
            for(int i=0; i<out.length; i++){
                if(i==0){
                    sb.append(out[i]);
                }
                else {
                    sb.append(" ").append(out[i]);
                }
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[start] = array[i];
                backtraking(array, out, visited, start + 1, M);
                visited[i] = false;
            }
        }
    }


}
