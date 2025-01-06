import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static class Problem24511 {




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

