package back.arregate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/10815}
 */
public class Problem10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> sangSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            sangSet.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            sb.append(sangSet.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
        }
        System.out.println(sb);
    }
}
