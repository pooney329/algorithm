import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static class Problem12789 {
        /**
         * 1 2 3 4 5
         * 1 5 3 2 4
         * 5 4 1 3 2
         * 5 4 3 2 1
         * <p>
         * <p>
         * 1 2 4 5 6
         * 1 2 5 3 4
         * 1 3 4 5 6
         */


        public String solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            Queue<Integer> waitingUserStack = new LinkedList<>();
            Stack<Integer> stockUserStack = new Stack<>();

            final int totalCount = Integer.parseInt(br.readLine());

            Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .forEach(waitingUserStack::add);

            int receiveUser = 1;
            while (!waitingUserStack.isEmpty()) {
                int waitUser = waitingUserStack.peek();
                if(waitUser == receiveUser){
                    waitingUserStack.poll();
                    receiveUser++;
                    continue;
                }


                if(stockUserStack.isEmpty()){
                    stockUserStack.add(waitingUserStack.poll());
                }
                else{
                    Integer stockUser = stockUserStack.peek();
                    if(stockUser == receiveUser){
                        stockUserStack.pop();
                        receiveUser++;
                    }
                    else{
                        stockUserStack.add(waitingUserStack.poll());
                    }
                }
            }

            //대기열과 비교대상을 비교한다
            while(!stockUserStack.isEmpty()){
                if(stockUserStack.pop() == receiveUser){
                    receiveUser++;
                }else{
                    return "Sad";
                }
            }
            br.close();
            return "Nice";
        }
    }

    public static void main(String[] args) throws IOException {
        Problem12789 problem12789 = new Problem12789();
        System.out.println(problem12789.solution());
    }
}

