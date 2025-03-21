package back.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] number = new int [5];
        Arrays.sort(number);
        int sum = 0;
        for(int i = 0; i < 5; i++){
            number[i] =  Integer.parseInt(br.readLine());
            sum += number[i];
        }
        Arrays.sort(number);

        System.out.println(sum / 5);
        System.out.println(number[2]);
    }
}
