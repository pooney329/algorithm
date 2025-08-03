package progrmmers.stack;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42587/solution_groups?language=java}
 */
public class Solution42587 {
    public static void main(String[] args) {
        Solution42587 Solution42587 = new Solution42587();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(Solution42587.solution2(priorities,location));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Program> priorityQueue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            priorityQueue.add(new Program(i, priorities[i]));
        }


        while(!priorityQueue.isEmpty()){
            answer++;
            Program pro = priorityQueue.poll();
            int max = pro.priority;
            for(Program existProgram : priorityQueue) {
                max = Math.max(max, existProgram.priority);
            }
            if(pro.priority < max){
                priorityQueue.add(pro);
                while(!priorityQueue.isEmpty()){
                    Program poll = priorityQueue.poll();
                    if(poll.priority != max) {
                        priorityQueue.add(poll);
                        continue;
                    }
                    if(poll.index == location) {
                        return answer;
                    }
                    break;
                }
            }
            else {
                if(pro.index == location) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public int solution2(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        //우선 순위 Q에 넣는다.
        for(int priority : priorities){
            priorityQueue.add(priority);
        }
        while(!priorityQueue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(!priorityQueue.isEmpty() &&priorities[i] == priorityQueue.peek()){
                    if(i == location){
                        return answer;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static class Program {
        int index;
        int priority;

        public Program(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Program{" +
                    "index=" + index +
                    ", priority=" + priority +
                    '}';
        }
    }

}
