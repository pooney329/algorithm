package progrmmers.heap;

import java.util.PriorityQueue;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42626}
 */
public class Solution42626_2 {
    public static void main(String[] args) {
        System.out.println(new Solution42626_2().solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int sco : scoville){
            priorityQueue.add(sco);
        }

        while(!priorityQueue.isEmpty()){
            Integer poll = priorityQueue.poll();
            if(poll>K) {
                break;
            }
            if(!priorityQueue.isEmpty()){
                Integer twoPoll = priorityQueue.poll();
                answer++;
                priorityQueue.add(poll + (twoPoll * 2));
            }
            else{
                return -1;
            }
        }


        return answer;
    }
}
