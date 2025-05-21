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
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;


        System.out.println((main.solution(scoville,k)));
    }

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.naturalOrder());
        for(int sco : scoville){
            priorityQueue.add(sco);
        }


        int count = 0;
        while(!priorityQueue.isEmpty()){
            Integer target = priorityQueue.poll();
            if(target >= K) break;
            if(priorityQueue.isEmpty()) return -1;
            int mix = target + (priorityQueue.poll() * 2);
            priorityQueue.add(mix);
            count++;
        }

        return count;
    }




}
