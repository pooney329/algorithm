package progrmmers.heap;

import java.util.PriorityQueue;

/**
 * @{link https://school.programmers.co.kr/learn/courses/30/lessons/42626}
 */
public class Solution42626 {


    public static void main(String[] args) {
        int scoville[] = new int[]{1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int j : scoville) {
            heap.add(j);
        }

        if(heap.peek() >= K){
            return 0;
        }

        while (heap.size() >= 2){
            if(heap.peek() >= K) break;
            answer++;
            heap.add(heap.poll() + (heap.poll() * 2));
        }

        return heap.peek() >= K ? answer : -1;

    }
}
