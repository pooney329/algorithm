package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
예제 입력 1
10
10 -4 3 1 5 6 -35 12 21 -1
예제 출력 1
33
예제 입력 2
10
2 1 -4 3 4 -4 6 5 -5 1
예제 출력 2
14
예제 입력 3
5
-1 -2 -3 -4 -5
예제 출력 3
-1
 */
public class Problem1912 {
    static int[] numbers = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        numbers = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<numbers.length; i++){
            recursive(i);
        }

        System.out.println(MAX);
    }


    static int MAX = Integer.MIN_VALUE;

    public static void recursive(int index) {

        int temp = 0;
        for (int i = index; i < numbers.length; i++) {
            temp += numbers[i];
            MAX = Math.max(MAX, temp);
        }
    }

}
