package progrmmers.heap;

import java.util.*;


/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42628}
 */
public class Solution42628 {

    public static void main(String[] args) {

//        String oprations[] = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        String oprations[] = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        Solution42628 solution42628 = new Solution42628();
        System.out.println(Arrays.toString(solution42628.solution(oprations)));
    }

    public int[] solution(String[] operations) {
        int[] answer = {};


        List<Integer> list = new ArrayList<>();

        for (String str : operations) {
            String[] commands = str.split(" ");
            String cmd = commands[0];
            int number = Integer.parseInt(commands[1]);

            if (cmd.equals("I")) {
                list.add(number);
                Collections.sort(list);
            } else if (cmd.equals("D") && !list.isEmpty()) {
                if (number == 1) {
                    list.remove(list.size() - 1);
                } else {
                    list.remove(0);
                }
            }
        }

        if (list.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{list.get(list.size() - 1), list.get(0)};
    }


    public int[] solution2(String[] operations) {
        int[] answer = {};

        //두개이 우선순위 큐를 준비
        PriorityQueue<Integer> orderQueue = new PriorityQueue<>();
        PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(String op : operations) {
            String[] splitOperation = op.split(" ");
            String command = splitOperation[0];
            Integer number = Integer.parseInt(splitOperation[1]);

            if(command.equals("I")){
                orderQueue.add(number);
                reverseQueue.add(number);
            }
            else if(command.equals("D")){
                if(number == 1) {
                    reverseQueue.poll();
                    orderQueue.clear();;
                    orderQueue.addAll(reverseQueue);
                }
                else {
                    orderQueue.poll();
                    reverseQueue.clear();;
                    reverseQueue.addAll(orderQueue);
                }
            }
        }

        if(orderQueue.size() <= 1 || reverseQueue.size() <= 1){
            return new int[]{0,0};
        }

        return new int[]{reverseQueue.poll(), orderQueue.poll()};
    }
}
