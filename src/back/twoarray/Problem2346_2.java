package back.twoarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Problem2346_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] numberArray = br.readLine().split(" ");

        ArrayDeque<Balloon> balloonArrayDeque = new ArrayDeque<>();
        for (int i = 0; i < numberArray.length; i++) {
            balloonArrayDeque.add(new Balloon(Integer.parseInt(numberArray[i]), i + 1));
        }

        StringBuilder sb = new StringBuilder();
        while (!balloonArrayDeque.isEmpty()) {
            Balloon balloon = balloonArrayDeque.poll();
            sb.append(balloon.position);
            if (balloon.number > 0) {
                for (int i = 1; i < balloon.number; i++) {
                    if (balloonArrayDeque.isEmpty()) break;
                    balloonArrayDeque.add(balloonArrayDeque.poll());
                }
            }
            else{
                    for (int i = 1; i < Math.abs(balloon.number); i++) {
                    if (balloonArrayDeque.isEmpty()) break;
                    balloonArrayDeque.addFirst(balloonArrayDeque.pollLast());
                }
            }
        }
        System.out.println(sb);

    }


    public static class Balloon {
        int number;
        int position;

        public Balloon(int number, int position) {
            this.number = number;
            this.position = position;
        }
    }
}
