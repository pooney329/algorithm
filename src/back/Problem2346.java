package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


/**
 *  {@link https://www.acmicpc.net/status?user_id=hookcu329&problem_id=2346&from_mine=1}
 */
public class Problem2346 {


    public static class Balloon {
        private final int position;
        private final int number;

        public Balloon(int position, int number) {
            this.position = position;
            this.number = number;
        }

        public int getPosition() {
            return position;
        }

        public int getNumber() {
            return number;
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer count = Integer.parseInt(br.readLine()) - 1;

        String[] numberArray = br.readLine().split(" ");

        Deque<Balloon> arrayDeque = new ArrayDeque<>();
        Integer target = Integer.parseInt(numberArray[0]);
        for (int i = 1; i < numberArray.length; i++) {
            arrayDeque.add(new Balloon(i+1 , Integer.parseInt(numberArray[i])));
        }


        StringBuilder sb = new StringBuilder("1");
        while (count-- > 0) {
            //오른쪽?
            if (target > 0) {
                for (int i = 1; i < target; i++) {
                    arrayDeque.add(arrayDeque.poll());
                }
                Balloon targetBalloon = arrayDeque.poll();
                target = targetBalloon.getNumber();
                sb.append(" ").append(targetBalloon.position);
            } else {
                //왼쪽?
                for (int i = 1; i < Math.abs(target); i++) {
                    arrayDeque.addFirst(arrayDeque.pollLast());
                }
                Balloon targetBalloon = arrayDeque.pollLast();
                target = targetBalloon.getNumber();
                sb.append(" ").append(targetBalloon.position);
            }
        }
        System.out.println(sb);
    }
}
