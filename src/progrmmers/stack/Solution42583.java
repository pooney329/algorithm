package progrmmers.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
 * <p>
 * 예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
 * <p>
 * 경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
 * 0	[]	[]	[7,4,5,6]
 * 1~2	[]	[7]	[4,5,6]
 * 3	[7]	[4]	[5,6]
 * 4	[7]	[4,5]	[6]
 * 5	[7,4]	[5]	[6]
 * 6~7	[7,4,5]	[6]	[]
 * 8	[7,4,5,6]	[]	[]
 * 따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
 * <p>
 * solution 함수의 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭 별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
 * <p>
 * 출력 예
 * bridge_length	weight	truck_weights	return
 * 2	10	[7,4,5,6]	8
 * 100	100	[10]	101
 * 100	100	[10,10,10,10,10,10,10,10,10,10]	110
 */
public class Solution42583 {


    public static void main(String[] args) {
        System.out.println("==");
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println("==");
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Truck> waitQueue = new LinkedList<>();
        Queue<Truck> roadQueue = new LinkedList<>();
        Queue<Truck> finishedQueue = new LinkedList<>();
        for (int truckWeight : truck_weights) {
            waitQueue.add(new Truck(truckWeight, 0));
        }


        int sum = 0;
        int time = 0;
        while (finishedQueue.size() < truck_weights.length) {
            time ++;
            // 도로에 있는 모든 트럭중에 나갈 수 있는지 체크
            for (int i = 0; i < roadQueue.size(); i++) {
                Truck poll = roadQueue.poll();
                poll.addTime();
                if (poll.time == bridge_length) {
                    finishedQueue.add(poll);
                    sum = sum - poll.wight;
                    continue;
                }
                roadQueue.add(poll);
            }

            //다음 차가 들어 올 수 있는지 체크 하여 들어 올 수 없다면 하나를 finishe에 넣는다 아니면 road에 넣는다.
            if(!waitQueue.isEmpty()) {
                Truck peekTruck = waitQueue.peek();
                if (weight >= peekTruck.wight + sum) {
                    waitQueue.poll();
                    sum = sum + peekTruck.wight;
                    roadQueue.add(peekTruck);
                }
            }
        }


        return time;
    }

    public static class Truck {
        int wight;
        int time;

        public Truck(int wight, int time) {
            this.wight = wight;
            this.time = time;
        }

        public void addTime(){
            this.time = time + 1;
        }
    }
}
