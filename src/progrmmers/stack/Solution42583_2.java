package progrmmers.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Solution42583_2 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Truck> trucksQueue = new LinkedList<>();
        Queue<Truck> waitTruckQueue = new LinkedList<>();
        for (int truck : truck_weights) {
            trucksQueue.add(new Truck(truck, bridge_length));
        }

        // 시간, 무게, 총대수
        int [] result = {0,0,0};
        while (result[2] != truck_weights.length){
            //다리를 건너는 트럭이 있으면 건 널 수 있는지?

            for(Truck waitTruck : waitTruckQueue){
                waitTruck.minusTime();
            }

            if (!waitTruckQueue.isEmpty() && waitTruckQueue.peek().time <= 0) {
                Truck waitTruck = waitTruckQueue.poll();
                result[1] = result[1] - waitTruck.number;
                result[2] = result[2] + 1;
            }



            //대기 트럭에서 가져올 수 있는지?
            if(!trucksQueue.isEmpty() && result[1] + trucksQueue.peek().number <= weight && waitTruckQueue.size() <= bridge_length) {
                Truck truck = trucksQueue.poll();
                waitTruckQueue.add(truck);
                result[1] = result[1] + truck.number;
            }



            result[0] = result[0] + 1;
        }

        return result[0];
    }


    public static class Truck {
        private int number;
        private int time;

        public Truck(int number, int time) {
            this.number = number;
            this.time = time;
        }

        public void minusTime(){
            this.time = this.time - 1;
        }
    }
}
