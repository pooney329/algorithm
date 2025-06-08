package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181928}
 */
public class Solution181928 {

    public static void main(String[] args) {
        Solution181928 Solution181928 = new Solution181928();
        System.out.println(Solution181928.solution(new int[]{3,4,5,2,1}));
    }

    public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int num : num_list) {
            if(num % 2 == 0) even.append(num);
            else odd.append(num);
        }
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }

}
