package back.dynmic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * {@link https://www.acmicpc.net/problem/9461}
 * 재귀 방식과 반복문을 통한 풀이
 */
public class Problem9461 {

    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n --> 0) {
            int target = Integer.parseInt(br.readLine());
            arr = new long[Math.max(target + 1,3)];
            Arrays.fill(arr, -1);
            arr[0] = 0L;
            arr[1] = 1L;
            arr[2] = 1L;
//            System.out.println(fibonacci(target));
            System.out.println(repeatFibonacci(target));
        }
    }


    public static long fibonacci(int n) {
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = fibonacci(n - 3) + fibonacci(n - 2);
        return arr[n];
    }

    public static long repeatFibonacci(int n) {
        if(n == 1) return 1;
        if(n == 2) return 1;

        long sum = 0;
        long first = 0;
        long two = 1;
        long three = 1;
        for(long i = 3; i <= n; i++) {
            sum = first + two;
            first = two;
            two = three;
            three = sum;
        }
        return sum;
    }


}

