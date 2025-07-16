package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181911}
 */
public class Solution181911 {
    public static void main(String[] args) {
        Solution181911 Solution181911 = new Solution181911();
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(Solution181911.solution(my_strings, parts));
    }

    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_strings.length; i++){
            sb.append(my_strings[i], parts[i][0], parts[i][1]+1);
        }
        return answer;
    }
}
