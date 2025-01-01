package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Problem18258 {


    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        QueueSolution queueSolution = new QueueSolution();
        for(int i=0; i < count; i++){
            String[] commandSplit = br.readLine().split(" ");
            Integer number = commandSplit.length > 1 ? Integer.parseInt(commandSplit[1]) : null;
            queueSolution.command(commandSplit[0],number);
        }

        System.out.println(queueSolution.sb.toString());
        br.close();
    }



    public static class QueueSolution {
        private final ArrayDeque<Integer> queue = new ArrayDeque<>();
        private final StringBuilder sb;

        public QueueSolution() {
            sb =  new StringBuilder();
        }

        public void command(String command, Integer number){
            switch (command) {
                case "push" : push(number); break;
                case "pop" : pop(); break;
                case "size" : size(); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }

        private void push(Integer number){
            this.queue.add(number);
        }

        private void pop(){
            if(this.queue.isEmpty()){
                sb.append(-1).append("\n");
                return;
            }

            sb.append(queue.poll()).append("\n");
        }

        private void size(){
            sb.append(this.queue.size()).append("\n");
        }

        private void empty(){
            if(this.queue.isEmpty()){
                sb.append(1).append("\n");
                return;
            }
            sb.append(0).append("\n");
        }


        private void front(){
            if(this.queue.isEmpty()){
                sb.append(-1).append("\n");
                return;
            }
            sb.append(queue.getFirst()).append("\n");
        }

        private void back(){
            if(this.queue.isEmpty()){
                sb.append(-1).append("\n");
                return;
            }
            sb.append(queue.getLast()).append("\n");
        }

    }
}
