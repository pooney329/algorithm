package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/24416}
 */
public class Problem24416 {

    static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        fibonacci(n);
        fibonacci2(n);
        System.out.println(count + 1);
        System.out.println(count2 - 1);
    }

    public static int count = 0;
    public static int count2 = 0;

    public static  int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        count++;
        return fibonacci(n-1)  + fibonacci(n-2);
    }

    public static int fibonacci2(int n){
        if(arr[n] != 0) {
            return arr[n];
        }
        count2++;
        arr[n] = fibonacci2(n-1) + fibonacci2(n-2);
        return arr[n];
    }


}

