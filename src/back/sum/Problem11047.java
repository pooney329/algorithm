package back.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int totalMoney = Integer.parseInt(st.nextToken());

        int[] moneyArray = new int[count];
        for (int i = 0; i < count; i++) {
            moneyArray[i] = Integer.parseInt(br.readLine());
        }
        int minCount = 0;
        int remainMoney = totalMoney;
        for (int i = moneyArray.length - 1; i >= 0; i--) {
            if (totalMoney / moneyArray[i] > 0) {
                minCount += (remainMoney / moneyArray[i]);
                remainMoney = (remainMoney % moneyArray[i]);
            }
        }
        System.out.println(minCount);


    }
}
