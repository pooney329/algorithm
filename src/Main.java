import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] Cost;
    static int[][] DP;

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        String [] op = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(main.solution(op)));
    }

    public int[] solution(String[] operations) {
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



    public int[] solution(String[] operations) {
        Queue<Integer> minpq = new PriorityQueue<>();
        Queue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            if (operation.startsWith("I ")) {
                int n = Integer.parseInt(operation.substring(2));
                minpq.offer(n);
                maxpq.offer(n);
            } else if (!minpq.isEmpty() && operation.equals("D -1")) {
                maxpq.remove(minpq.poll());
            } else if (!maxpq.isEmpty() && operation.equals("D 1")) {
                minpq.remove(maxpq.poll());
            }
        }

        if (minpq.isEmpty() && maxpq.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{maxpq.poll(), minpq.poll()};
    }




}
