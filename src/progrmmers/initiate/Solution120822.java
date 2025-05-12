package progrmmers.initiate;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120822}
 */
public class Solution120822 {

    public static void main(String[] args) {
        Solution120822 solution120822 = new Solution120822();
        System.out.println(solution120822.solution("jaron"));

    }

    public String solution(String my_string) {
      StringBuilder sb = new StringBuilder();
      for(int i=my_string.length() -1; i>=0; i--){
          sb.append(my_string.charAt(i));
      }
      return sb.toString();
    }
}
