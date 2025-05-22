package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120849?language=java}
 */
public class Solution120849 {
    public static void main(String[] args) {
//        String my_string = "bus";
        String my_string = "nice to meet you";
        Solution120849 Solution120849 = new Solution120849();
        System.out.println(Solution120849.solution(my_string));
    }
    public String solution(String my_string) {
        String str = "a,e,i,o,u";

        StringBuilder sb = new StringBuilder();
        for(String v : my_string.split("")){
            if(!str.contains(v)){
                sb.append(v);
            }
        }
        return sb.toString();
    }
}
