package progrmmers.heap;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution42627_2 {
    public static void main(String[] args) {
        Solution42627_2 Solution42627_2 = new Solution42627_2();
        int[][] jobs = new int[][]{{0,3}, {1,9}, {3,5}};
        System.out.println(Solution42627_2.solution(jobs));
    }

    public int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Job> priorityQueue = new PriorityQueue<>(
            Comparator.comparing(Job::getTime)
                    .thenComparing(Job::getRequestTime)
                    .thenComparing(Job::getIndex)
        );

        Queue<Job> queue = new LinkedList<>();
        for(int i=1; i<jobs.length; i++){
            queue.add(new Job(i,jobs[i][0],jobs[i][1]));
        }

        priorityQueue.add(new Job(0, jobs[0][0],jobs[0][1]));

        int time = 0;
        while(priorityQueue.isEmpty()){
            priorityQueue.peek();
        }


        return answer;
    }


    public static class Job {
        int index;
        int requestTime;
        int time;

        public Job(int index, int requestTime, int time) {
            this.index = index;
            this.requestTime = requestTime;
            this.time = time;
        }

        public int getIndex() {
            return index;
        }

        public int getRequestTime() {
            return requestTime;
        }

        public int getTime() {
            return time;
        }
    }
}
