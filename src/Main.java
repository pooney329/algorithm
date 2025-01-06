import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static class Problem24511 {

        public static class QueueStack {
            private Deque<Integer> collection;
            private Integer type;

            public QueueStack(Deque<Integer> collection, Integer type) {
                this.collection = collection;
                this.type = type;
            }

            public void add(Integer number) {
                this.collection.add(number);
            }

            public Integer addPop(Integer number) {
                this.collection.add(number);
                if (type == 0) {
                    return this.collection.pollFirst();
                }
                return this.collection.pollLast();
            }

        }


        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int structureCount = Integer.parseInt(br.readLine());

            int[] structureArray = new int[structureCount];

            StringTokenizer stArray = new StringTokenizer(br.readLine());
            StringTokenizer initNumArray = new StringTokenizer(br.readLine());

            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < structureCount; i++) {
                Integer structure = Integer.parseInt(stArray.nextToken());
                int num = Integer.parseInt(initNumArray.nextToken());
                if (structure == 0) {
                    deque.add(num);
                }
            }


            StringBuilder sb = new StringBuilder();
            int M = Integer.parseInt(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            while (M --> 0){
                deque.addFirst(Integer.parseInt(st2.nextToken()));

                sb.append(deque.pollLast()).append(" ");
            }
            System.out.println(sb);
        }
    }


    public static void main(String[] args) throws IOException {
        Problem24511 problem12789 = new Problem24511();
        problem12789.solution();
    }
}

