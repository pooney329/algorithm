package back.arregate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/14425}
 */
public class Problem14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> arregateSet = new HashSet<>();
        for(int i=0; i<N; i++){
            arregateSet.add(br.readLine());
        }

        int sum = 0;
        for(int j=0; j<M; j++){
            if(arregateSet.contains(br.readLine())){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
