package progrmmers.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42583}
 */
public class Solution42583 {


    public static void main(String[] args) {
        System.out.println("==");
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println("==");
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> waitQueue = new LinkedList<>();
        Queue<Truck> roadQueue = new LinkedList<>();
        Queue<Truck> finishedQueue = new LinkedList<>();
        for (int truckWeight : truck_weights) {
            waitQueue.add(new Truck(truckWeight, bridge_length));
        }


        int sum = 0;
        int time = 0;
        while (finishedQueue.size() < truck_weights.length) {
            time++;
            if (!waitQueue.isEmpty()) {
                while (true) {
                    if (waitQueue.isEmpty()) break;
                    Truck waitTruck = waitQueue.peek();
                    if (weight >= sum + waitTruck.wight) {
                        waitQueue.poll();
                        roadQueue.add(waitTruck);
                        sum = sum + waitTruck.wight;
                        continue;
                    }
                    break;
                }
            }

            if (!roadQueue.isEmpty()) {
                for (Truck t : roadQueue) {
                    t.minusTime();
                }
                Truck roadTruck = roadQueue.peek();
                if (roadTruck.time <= 0) {
                    roadQueue.poll();
                    sum -= roadTruck.wight;
                    finishedQueue.add(roadTruck);
                }
            }
        }


        return time + 1;
    }

    public static class Truck {
        int wight;
        int time;

        public Truck(int wight, int time) {
            this.wight = wight;
            this.time = time;
        }

        public void minusTime() {
            this.time = time - 1;
        }
    }
}
