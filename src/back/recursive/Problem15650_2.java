package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/15650}
 */
public class Problem15650_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] result = new int[N];
        recursive(1, M, N, 0, result);
    }

    public static void recursive(int index, int end, int limit, int depth, int[] result) {
        if (depth == limit) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                if (i == 0) {
                    sb.append(result[i]);
                } else {
                    sb.append(" ")
                            .append(result[i]);

                }
            }
            System.out.println(sb);
            return;
        }
        for (int i = index; i <= end; i++) {
            result[depth] = i;
            recursive(i + 1, end, limit, depth + 1, result);
        }
    }
}
