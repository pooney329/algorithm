package back.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  {@link https://www.acmicpc.net/problem/2750}
 */
public class Problem2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer totalCount = Integer.parseInt(br.readLine());

        int[] array = new int[totalCount];
        for(int i=0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < totalCount; i++){
            int temp;
            for(int j = 1; j < totalCount; j++){
                if(array[j] < array[j - 1]){
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int n : array){
            sb.append(n).append("\n");
        }
        System.out.println(sb);
    }
}
