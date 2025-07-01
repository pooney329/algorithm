package progrmmers.initiate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181885}
 */
public class Solution181885 {
    public static void main(String[] args) {
        Solution181885 solution181885 = new Solution181885();
        System.out.println(Arrays.toString(solution181885.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false})));
    }
    public String[] solution(String[] todo_list, boolean[] finished) {

        List<String> list = new ArrayList<>();
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
