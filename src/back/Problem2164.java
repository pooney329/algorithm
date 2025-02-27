package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2164 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=number; i++){
            queue.add(i);
        }

        while (queue.size() > 1){
            queue.poll();
            Integer target = queue.poll();
            queue.add(target);
        }
        System.out.println(queue.poll());
        br.close();
    }
}
