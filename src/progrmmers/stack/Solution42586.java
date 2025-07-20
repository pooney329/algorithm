package progrmmers.stack;

import java.util.*;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42586}
 */
public class Solution42586 {
    public static void main(String[] args) {
        Solution42586 Solution42586 = new Solution42586();
        int[] progress = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(Solution42586.solution(progress, speeds)));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Progress> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.add(new Progress(i, progresses[i], speeds[i]));
        }

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            //배포 가능
            int count = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Progress peek = queue.peek();
                if (peek != null && peek.progressRate >= 100) {
                    queue.poll();
                    count++;
                    continue;
                }
                break;
            }
            if(count > 0) {
                list.add(count);
            }
            //시간 차감
            if (!queue.isEmpty()) {
                for(Progress poll : queue){
                    poll.process();
                }
            }
        }

        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public static class Progress {
        int index;
        int progressRate;
        int speed;

        public Progress(int index, int progressRate, int speed) {
            this.index = index;
            this.progressRate = progressRate;
            this.speed = speed;
        }

        public void process(){
            this.progressRate += this.speed;
        }
    }
}
