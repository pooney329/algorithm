package progrmmers.heap;

import java.util.PriorityQueue;

/**
 * 작업의 소요시간이 짧은 것, 작업의 요청 시각이 빠른 것, 작업의 번호가 작은 것 순으로 우선순위가 높
 */

public class Solution42627 {

    public static void main(String[] args) {
        Solution42627 solution42627 = new Solution42627();
        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {3, 5}};
        System.out.println(solution42627.solution(jobs));
    }


    public int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Job> jobPriorityQueue = new PriorityQueue<>((job1, job2) -> {
            if (job1.getJobTime() != job2.getJobTime()) {
                return job1.getJobTime() - job2.getJobTime();
            } else if (job1.requestTime != job2.requestTime) {
                return job1.getJobTime() - job2.getJobTime();
            } else {
                return job1.getNo() - job2.getNo();
            }
        });

        for (int i = 0; i < jobs.length; i++) {
            jobPriorityQueue.add(new Job(i, jobs[i][0], jobs[i][1]));
        }

        int i = 0;
        while (!jobPriorityQueue.isEmpty()) {
            Job waitJob = jobPriorityQueue.peek();

            //완료 된 잡
            if (waitJob.getRequestTime() <= i && waitJob.getJobTime() == 0) {
                waitJob.setFinishTime(i - waitJob.requestTime);
                answer += waitJob.getFinishTime();
                jobPriorityQueue.poll();
                System.out.println(waitJob.getFinishTime());
                continue;
            }

            //진행중인 잡
            waitJob.minusJobTime();
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
