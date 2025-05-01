package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120824}
 */
public class Solution120824 {


    public static void main(String[] args) {
        int[] num_list = new int[]{1, 2, 3, 4, 5};
        Solution120824 solution120824 = new Solution120824();

        System.out.println(solution120824.solution(num_list));

    }

    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        for(int num : num_list){
            if(num % 2 == 0){
                result[0]++;
            }else{
                result[1]++;
            }
        }
        return result;
    }
}
