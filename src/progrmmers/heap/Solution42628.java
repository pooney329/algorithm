package progrmmers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * operations	return
 * ["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]	[0,0]
 * ["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"]	[333, -45]
 */
public class Solution42628 {

    public static void main(String[] args) {
        System.out.println(-643 - 45);
        String oprations[] = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        Solution42628 solution42628 = new Solution42628();
        System.out.println(Arrays.toString(solution42628.solution(oprations)));
    }

    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o2) - Math.abs(o1);
            }
        });

        for (String operation : operations) {
            String[] op = operation.split(" ");
            String command = op[0];
            int number = Integer.parseInt(op[1]);
            if (command.equals("I")) {
                priorityQueue.add(number);
            } else {
                if (priorityQueue.isEmpty()) {
                    continue;
                }
                if (number == 1) {
                    priorityQueue.poll();
                } else {
                    for (int i = 0; i < priorityQueue.size(); i++) {
                        priorityQueue.add(priorityQueue.poll());
                    }
                    priorityQueue.poll();
                }
            }

        }
        if (priorityQueue.isEmpty()) {
            return new int[]{0, 0};
        }

        answer = new int[2];
        answer[0] = priorityQueue.poll();

        for (int i = 0; i < priorityQueue.size() - 1; i++) {
            priorityQueue.poll();
        }
        answer[1] = priorityQueue.poll();
        return answer;
    }
}
