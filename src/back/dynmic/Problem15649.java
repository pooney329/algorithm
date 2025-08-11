package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/15649}
 */
public class Problem15649 {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int [] numbers = new int[N];
        boolean [] visited = new boolean[N];
        for(int i=0; i < N; i++){
            numbers[i] = i + 1;
        }
        recursive(0, visited, numbers, M, "");
        System.out.println(sb);
    }

    public static void recursive(int index, boolean[] visited, int[] numbers, int limit, String sum) {
        if(index  ==  limit) {
            String[] s = sum.split("");
            for(int i=0; i<s.length; i++){
                if(i == 0){
                    sb.append(s[i]);
                }
                else {
                    sb.append(" ").append(s[i]);
                }
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<numbers.length; i++){
            if(!visited[i]){
                visited[i] = true;
                recursive(index + 1, visited, numbers, limit, sum + numbers[i]);
                visited[i] = false;
            }
        }
    }
}
