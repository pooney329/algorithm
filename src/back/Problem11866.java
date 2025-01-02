package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem11866 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        final int N = Integer.parseInt(array[0]);
        final int K = Integer.parseInt(array[1]);

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }



        StringBuilder builder = new StringBuilder("<");
        while(queue.size() >= 1){
            for(int i=1; i<K; i++){
                queue.add(queue.poll());
            }

            builder.append(queue.poll());
            if(queue.size() != 0){
                builder.append(", ");
            }
        }

        System.out.println(builder.append(">"));
    }
}
