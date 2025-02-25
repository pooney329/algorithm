package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/1904}
 * 모듈러연산이 핵심
 */

public class Problem1904 {
    static int[] arr = new int[1000000 + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = -1;
        }

//        System.out.println(fibonacci(n));
        System.out.println(repeatFibonacci(n));
    }

    // 재구 호출 방식 (비효율적 방식)
    public static int fibonacci(int n) {
        if (arr[n] != -1) return arr[n];
        arr[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 15746;
        return arr[n];
    }

    public static int repeatFibonacci(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int sum = 0;
        int prev = 1;
        int next = 2;
        for(int i = 3; i <= n; i++) {
            sum = (prev + next) % 15746;
            prev = next % 15746;
            next = sum % 15746;
        }
        return sum;
    }
}
