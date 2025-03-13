package back.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 5 3
 * 1 2 3 1 2
 */
public class Problem10986 {
    static int count;
    static int[] array;
    static int[] sumArray;
    static int m = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        count = Integer.parseInt(st.nextToken());
        int divide = Integer.parseInt(st.nextToken());

        array = new int[count + 1];
        sumArray = new int[count + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            sumArray[i] = sumArray[i - 1] + array[i];
            if (sumArray[i] % divide == 0) {
                m++;
            }
        }


        for (int i = 1; i < count; i++) {
            for (int j = 1; j < count; j++) {
                if ((sumArray[j] - sumArray[j - 1]) % divide == 0) {
                    m++;
                }
            }
        }

        System.out.println(m);

    }

}
