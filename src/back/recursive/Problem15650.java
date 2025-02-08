package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @{link https://www.acmicpc.net/problem/15650}
 */
public class Problem15650 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        for(int i=0; i<N; i++){
            arr[i] = i + 1;
        }

        recusive(arr,visited,0, 0, M);
        System.out.println(sb);


    }

    public static void recusive(int[] arr, boolean[] visited, int startIndex, int depth, int M){
        if(depth == M) {
            for(int i=0; i< visited.length; i++){
                if(visited[i]){
                    sb.append(arr[i]).append(" ");
                }
            }
            sb.append("\n");
            return;
        }


        for(int i=startIndex; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                recusive(arr,visited,i, depth + 1, M);
                visited[i] = false;
            }
        }
    }




}
