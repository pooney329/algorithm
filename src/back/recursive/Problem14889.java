package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem14889 {

    static int[][] arr;
    static int[] out;
    static boolean[] visited;
    static boolean[] subVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        out = new int[N];
        visited = new boolean[N];
        subVisited = new boolean[N / 2];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursive(0, N);
        System.out.println(min);
    }


    static int min = Integer.MAX_VALUE;
    public static void recursive(int n, int limit) {
        if (n == limit) {
            int subLimit = limit / 2;
            int[] first = Arrays.copyOfRange(out, 0, subLimit);
            int[] two = Arrays.copyOfRange(out, subLimit, out.length);
            int firstSum = subRecursive(first, new int[subLimit], 0, subLimit);
            int twoSum = subRecursive(two, new int[subLimit], 0, subLimit);
            min = Math.min(min,Math.abs(firstSum - twoSum));
            return;
        }

        for (int i = 0; i < limit; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[n] = i + 1;
                recursive(n + 1, limit);
                visited[i] = false;
            }
        }

    }


    public static int subRecursive(int[] subArr, int[] out, int n, int limit) {
        if (n == limit) {
            int sum = 0;
            for(int i=0; i<out.length; i++) {
                for(int j=0; j<out.length; j++) {
                    if(i == j) continue;
                    sum += arr[out[i]-1][out[j]-1];
                }
            }
            return sum;
        }

        for (int i = 0; i < limit; i++) {
            if (!subVisited[i]) {
                subVisited[i] = true;
                out[n] = subArr[i];
                int s = subRecursive(subArr, out, n + 1, limit);
                subVisited[i] = false;
                return s;
            }
        }
        return 0;
    }
}
