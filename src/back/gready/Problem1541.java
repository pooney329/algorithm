package back.gready;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subNumber = br.readLine().split("-");

        int sum = 0;
        for(int i=0; i< subNumber.length; i++){
            Integer plusSum = 0;
            String[] plusArray = subNumber[i].split("\\+");
            for(String plusNumber : plusArray){
                plusSum += Integer.parseInt(plusNumber);
            }

            if(i == 0){
                sum = plusSum;
            }
            else {
                sum = sum - plusSum;
            }
        }
        System.out.println(sum);;
    }
}
