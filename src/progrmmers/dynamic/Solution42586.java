package progrmmers.dynamic;

import java.util.*;

/**
 * {@link  https://school.programmers.co.kr/learn/courses/30/lessons/42586}
 */
public class Solution42586 {

    public static void main(String[] args) {
        solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};


        Queue<Work> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.add(new Work(progresses[i],speeds[i]));
        }


        List<Integer> result = new ArrayList<>();
        int day = 0;
        while(!queue.isEmpty()){
            day++;
            Work work = queue.peek();
            int remainDay = work.remainDay(day);
            if(remainDay <= 0){
                int count = 1;
                queue.poll();
                while (!queue.isEmpty()){
                    Work work1 = queue.peek();
                    if(work1.remainDay(day) <= 0){
                        count++;
                        queue.poll();
                        continue;
                    }
                    break;
                }
                result.add(count);
            }
        }
        int[] array = new int[result.size()];
        for(int i=0; i<array.length; i++){
            array[i] = result.get(i);
        }
        return array;
    }


    public static class Work {
        int progress;
        int speed;
        int remainDay;


        public Work(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
            this.remainDay = 100 - progress;
        }


        public int remainDay(int day){
            int multiply = day * speed;
            return remainDay - multiply;
        }
    }
}
