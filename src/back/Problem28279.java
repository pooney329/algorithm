package back;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * https://www.acmicpc.net/problem/28279
 */
public class Problem28279 {


    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 1; i <= count; i++) {
            String[] commands = br.readLine().split(" ");
            Integer command1 = Integer.parseInt(commands[0]) ;
            Integer command2 = commands.length > 1 ? Integer.parseInt(commands[1]) : null;
            deck(arrayDeque, command1, command2);

        }

    }

    public void deck(ArrayDeque<Integer> arrayDeque, Integer command1, Integer command2) {
        switch (command1) {
            case 1:
                arrayDeque.addFirst(command2);
                break;
            case 2:
                arrayDeque.addLast(command2);
                break;
            case 3:
                if (!arrayDeque.isEmpty()) {
                    System.out.println(arrayDeque.pollFirst());
                } else {
                    System.out.println(-1);
                }
                break;

            case 4:
                if (!arrayDeque.isEmpty()) {
                    System.out.println(arrayDeque.pollLast());
                } else {
                    System.out.println(-1);
                }
                break;
            case 5:
                System.out.println(arrayDeque.size());
                break;

            case 6:
                System.out.println(arrayDeque.isEmpty() ? 1 : 0);
                break;
            case 7:
                if (!arrayDeque.isEmpty()) {
                    System.out.println(arrayDeque.peekFirst());
                } else {
                    System.out.println(-1);
                }
                break;
            case 8:
                if (!arrayDeque.isEmpty()) {
                    System.out.println(arrayDeque.peekLast());
                } else {
                    System.out.println(-1);
                }
                break;
        }
    }

}
