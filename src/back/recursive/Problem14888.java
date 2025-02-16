package back.recursive;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/14888}
 */
public class Problem14888 {

    static int[] arr;
    static int[] operator;
    static int[] out;
    static int max = Integer.MIN_VALUE; // 최댓값 초기화
    static int min = Integer.MAX_VALUE; // 최솟값 초기화

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        operator = new int[4];
        out = new int[count - 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        recusive(0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void recusive(int depth) {
        if (depth == out.length) {
            calculator();
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                out[depth] = i;
                recusive(depth + 1);
                operator[i]++;
            }
        }
    }

    public static void calculator() {
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int op = out[i - 1];
            if (op == 0) {
                sum += arr[i];
            } else if (op == 1) {
                sum -= arr[i];
            } else if (op == 2) {
                sum *= arr[i];
            } else {
                // 나눗셈: C++ 스타일 적용
                if (sum < 0) {
                    sum = -(-sum / arr[i]);
                } else {
                    sum /= arr[i];
                }
            }
        }

        max = Math.max(max, sum);
        min = Math.min(min, sum);
    }
}
