package progrmmers.dynamic;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42895}
 */
public class Solution42895 {

    public static void main(String[] args) {
        Solution42895 Solution42895 = new Solution42895();
        System.out.println(Solution42895.solution(5, 12));
        ;
    }

    public int solution(int N, int number) {
        int answer = 0;

        Set<Integer>[] dp = new HashSet[10];
        int concatNumber = 0;
        int cnt = 1;
        for (int i = 1; i <= 8; i++) {
            dp[i] = new HashSet<>();
            concatNumber = concatNumber + N * cnt;
            dp[i].add(concatNumber);
            cnt *= 10;
            System.out.println("i : " + i);
            for (int j = 1; j < i; j++) {
                for (Integer num : dp[j]) {
                    for(Integer v : dp[i - j]){
                        dp[i].add(num + v);
                        dp[i].add(num - v);
                        dp[i].add(num * v);
                        if(v != 0){
                            dp[i].add(num / v);
                        }
                    }
                }
            }
            if(dp[i].contains(number)){
                answer = i;
                break;
            }
        }


        return answer == 0 ? -1 : answer;
    }


}
