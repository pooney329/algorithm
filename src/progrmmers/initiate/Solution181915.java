package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181915?language=java}
 */
public class Solution181915 {
    public static void main(String[] args) {
        Solution181915 Solution181915 = new Solution181915();
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(Solution181915.solution(my_string, index_list));
    }


    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for(int index : index_list){
            sb.append(my_string.charAt(index));
        }
        return sb.toString();
    }
}
