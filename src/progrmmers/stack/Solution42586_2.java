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
        int[] answer = {};
        Queue<Progress> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++) {
            queue.add(new Progress(i, progresses[i], speeds[i]));
        }

        int day = 0;
        List<Integer> deployList = new ArrayList<>();
        while(!queue.isEmpty()) {
            int count = 1;
            Progress progress = queue.poll();
            day += Math.ceil((100 - (progress.rate + progress.speed * day)) / (double)progress.speed);
            while(!queue.isEmpty()){
                Progress nextProgress = queue.peek();
                if((nextProgress.speed * day) + nextProgress.rate >= 100){
                    queue.poll();
                    count++;
                    continue;
                }
                break;
            }
            deployList.add(count);
        }
        answer = new int[deployList.size()];
        for(int i=0; i<deployList.size(); i++){
            answer[i] = deployList.get(i);
        }
        return answer;
    }

    public static class Progress {
        int index;
        int rate;
        int speed;

        public Progress(int index, int rate, int speed) {
            this.index = index;
            this.rate = rate;
            this.speed = speed;
        }
    }
}
