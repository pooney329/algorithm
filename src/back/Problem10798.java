package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/status?user_id=hookcu329&problem_id=10798&from_mine=1}
 */
public class Problem10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];
        for(int i=0; i<5; i++){
            String[] s = br.readLine().split("");
            for(int j=0; j<s.length; j++){
                arr[i][j] = s[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] == null) continue;
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);


    }
}
