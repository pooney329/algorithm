package progrmmers.sort;

import java.util.Arrays;

/**
 *  {@link https://school.programmers.co.kr/learn/courses/30/lessons/42747?language=java}
 */
public class Solution42747 {

    public static void main(String[] args) {
//        System.out.println( 0/3);
//        int[] citations = new int[]{3, 0, 6, 1, 5};
//        int[] citations = new int[]{3,3,3,3,2,2,2};
        int[] citations = new int[]{5, 6, 7, 8};

        System.out.println(new Solution42747().solution(citations));

    }
    // 0,1,3,5,6
    public int solution(int[] citations) {
        int answer = 0;


        Arrays.sort(citations);

        int max = citations[citations.length-1];

        for (int k = max; k > 0; k--) {
            int index = -1;
            for (int i = citations.length - 1; i >= 0; i--) {
                   if(citations[i] / k > 0){
                       continue;
                   }
                   index = i;
                   break;
            }
            if(index + 1 <= k &&  citations.length - (index + 1) >= k){
                answer = k;
                break;
            }
        }

        return answer;
    }
}
