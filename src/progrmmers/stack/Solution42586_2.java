package progrmmers.stack;

import java.util.*;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42586}
 */
public class Solution42586_2 {
    public static void main(String[] args) {
        Solution42586_2 solution425862 = new Solution42586_2();
//        int progress [] = new int[]{93, 30, 55};
//        int speed[] = new int[]{1, 1, 1, 1, 1, 1};

//        int progress [] = new int[]{93, 30, 55};
//        int speed[] = new int[]{1, 30, 5};

        int progress [] = new int[]{99, 70, 70};
        int speed[] = new int[]{10, 5, 10};
        System.out.println(Arrays.toString(solution425862.solution(progress, speed)));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            queue.add((int) Math.ceil((100 - (double) progresses[i]) / speeds[i]));
        }

        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            Integer progress = queue.poll();
            int count = 1;
            while(!queue.isEmpty()){
                if(queue.peek() <= progress) {
                    queue.poll();
                    count++;
                    continue;
                }
                break;
            }
            result.add(count);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }


}
