package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1904 {
    static int limit;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        limit = Integer.parseInt(br.readLine());
        arr = new int[limit + 1];
        arr[1] = 1;
        arr[2] = 2;
        int count = fibonacci(limit);
        System.out.println(count % 15746);

    }

    public static int fibonacci (int n){
        if(arr[n] != 0){
            return arr[n];
        }
        arr[n] =  fibonacci(n-1) + fibonacci(n-2) ;
        return arr[n];
    }
}
