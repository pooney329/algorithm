package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/14889}
 */

public class Problem14889 {

    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursive(0, 0, N);

        System.out.println(min);
    }

    public static void recursive(int start, int depth, int limit) {
        if (depth == limit / 2) {
            additionalRecursive();
            return;
        }

        for (int i = start; i < limit; i++) {
            if (!visited[i] && min != 0) {
                visited[i] = true;
                recursive(i + 1, depth + 1, limit);
                visited[i] = false;
            }
        }

    }

    private static void additionalRecursive() {
        int firstTeam = 0;
        int secondTeam = 0;

        for (int i = 0; i < visited.length - 1; i++) {
            for (int j = i + 1; j < visited.length; j++) {
                if (visited[i] && visited[j]) {
                    firstTeam += arr[i][j] + arr[j][i];
                } else if (!visited[i] && !visited[j]) {
                    secondTeam += arr[i][j] + arr[j][i];
                }
            }
        }
        min = Math.min(min, Math.abs(firstTeam - secondTeam));
    }


}
