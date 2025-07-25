package progrmmers.stack;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/1845}
 */
public class Solution1845 {
    public static void main(String[] args) {
        Solution1845 solution1845 = new Solution1845();
        solution1845.solution(new int[]{3,1,2,3});
    }

    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> duplicateFilterSet = new HashSet<>();
        for(int num : nums){
            duplicateFilterSet.add(num);
        }
        int maxPoketmon = nums.length / 2;
        return (maxPoketmon / 2) <= duplicateFilterSet.size() ? maxPoketmon : duplicateFilterSet.size();
    }

}
