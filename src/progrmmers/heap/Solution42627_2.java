package progrmmers.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42627}
 */
public class Solution42627_2 {
    public static void main(String[] args) {
        Solution42627_2 Solution42627_2 = new Solution42627_2();
        int[][] jobs = new int[][]{{0,3}, {1,9}, {3,5}};
        System.out.println(Solution42627_2.solution(jobs));
    }

    public int solution(int[][] jobs) {
        int answer = 0;
        //요청일 기준으로 정렬
        Arrays.sort(jobs, Comparator.comparing(i -> i[0]));
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparing(i -> i[1]));

        int index = 0;
        int time = 0;
        int total = 0;
        while (index < jobs.length || !priorityQueue.isEmpty()){
            while(index < jobs.length && jobs[index][0] <= time) {
                priorityQueue.offer(jobs[index++]);
            }

            if(!priorityQueue.isEmpty()){
                int[] poll = priorityQueue.poll();
                time += poll[1];
                total += time - poll[0];
            }
            else {
                time++;
            }
        }


        return total / jobs.length;
    }
}
