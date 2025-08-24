package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/status?user_id=hookcu329&problem_id=25501&from_mine=1}
 */
public class Problem25501_2 {
    public static int callCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(count --> 0){
            callCount = 1;
            String s = br.readLine();
            sb.append(recursion(s,0, s.length()-1))
                    .append(" ")
                    .append(callCount)
                    .append("\n")
            ;

        }
        System.out.println(sb.toString());
    }

    public static int recursion(String s, int start, int end) {
        if (start >= end) {
            return 1;
        }
        else if (s.charAt(start) != s.charAt(end)) {
            return 0;
        }
        callCount++;
        return recursion(s, start +1 , end-1);
    }

}
