package progrmmers.stack;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42578}
 */
public class Solution42578 {
    public static void main(String[] args) {
        Solution42578 solution42578 = new Solution42578();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution42578.solution(clothes));
    }

    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> clothsMap = new HashMap<>();
        for (String[] cloth : clothes) {
            clothsMap.put(cloth[1], clothsMap.getOrDefault(cloth[1], 1) + 1);
        }

        for(Map.Entry<String, Integer> entries : clothsMap.entrySet()){
            answer *= entries.getValue();
        }
        return answer - 1;
    }


}
