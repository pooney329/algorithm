package progrmmers.heap;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 작업의 소요시간이 짧은 것, 작업의 요청 시각이 빠른 것, 작업의 번호가 작은 것 순으로 우선순위가 높
 */

public class Solution42627 {

    public static void main(String[] args) {
        Solution42627 solution42627 = new Solution42627();
        int[][] jobs = new int[][]{{1, 2}, {4, 2}, {7, 9}};
        System.out.println(solution42627.solution(jobs));
    }


    public int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Job> jobPriorityQueue = new PriorityQueue<>((job1, job2) -> {
            if (job1.getJobTime() != job2.getJobTime()) {
                return job1.getJobTime() - job2.getJobTime();
            } else if (job1.requestTime != job2.requestTime) {
                return job1.getRequestTime() - job2.getRequestTime();
            } else {
                return job1.getNo() - job2.getNo();
            }
        });

        Queue<Job> excuteQueue = new LinkedList<>();

        for (int i = 0; i < jobs.length; i++) {
            jobPriorityQueue.add(new Job(i, jobs[i][0], jobs[i][1]));
        }

        int i = 0;
        while (!jobPriorityQueue.isEmpty()) {
            if(jobPriorityQueue.peek().getRequestTime() > i){
                i++;
                continue;
            }

            if(excuteQueue.isEmpty() && jobPriorityQueue.peek().getRequestTime() <= i){
                Job job = jobPriorityQueue.poll();
                excuteQueue.add(job);
                continue;
            }



            Job executeJob = excuteQueue.peek();
            executeJob.minusJobTime();

            if(executeJob.getJobTime() == 0){
                Job job = excuteQueue.poll();
                answer += i - job.requestTime;
            }
            i++;
        }


        return answer / jobs.length;
    }


    public static class Job {
        private int no;
        private int requestTime;
        private int jobTime;

        private int finishTime;

        public Job(int no, int requestTime, int jobTime) {
            this.no = no;
            this.requestTime = requestTime;
            this.jobTime = jobTime;
        }

        public int getNo() {
            return no;
        }

        public int getRequestTime() {
            return requestTime;
        }

        public int getJobTime() {
            return jobTime;
        }

        public void setFinishTime(int finishTime) {
            this.finishTime = finishTime;
        }

        public int getFinishTime() {
            return finishTime;
        }

        public void minusJobTime() {
            this.jobTime = this.jobTime - 1;
        }

    }
}
