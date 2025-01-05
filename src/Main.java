import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    public static class Problem24511 {

        public static class QueueStack {
            private Collection<Integer> collection;
            private Integer type;

            public QueueStack(Collection<Integer> collection, Integer type) {
                this.collection = collection;
                this.type = type;
            }

            public void add(Integer number) {
                this.collection.add(number);
            }

            public Integer addPop(Integer number) {
                this.collection.add(number);
                if (type == 0) {
                    return ((LinkedList<Integer>) this.collection).poll();
                } else {
                    return ((Stack<Integer>) this.collection).pop();
                }
            }

        }


        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int structureCount = Integer.parseInt(br.readLine());

            QueueStack[] queueStack = new QueueStack[structureCount];

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < queueStack.length; i++) {
                int type = Integer.parseInt(st.nextToken());
                queueStack[i] = type == 0 ? new QueueStack(new LinkedList<Integer>(), type)
                        : new QueueStack(new Stack<Integer>(), type);

                int number = Integer.parseInt(st2.nextToken());
                queueStack[i].add(number);
            }


            StringBuilder sb = new StringBuilder();
            int command = Integer.parseInt(br.readLine());
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for(int i=0; i<command; i++){
                Integer nextValue = Integer.parseInt(st3.nextToken());
                for (QueueStack qs : queueStack) {
                    nextValue = qs.addPop(nextValue);
                }
                if (sb.length() == 0) {
                    sb.append(nextValue);
                } else {
                    sb.append(" ").append(nextValue);
                }
            }

            System.out.println(sb);
        }
    }


    public static void main(String[] args) throws IOException {
        Problem24511 problem12789 = new Problem24511();
        problem12789.solution();
    }
}

