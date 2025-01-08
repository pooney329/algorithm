import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static class Problem27433 {

        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            System.out.println(recursive(N));
        }

        public long recursive(long num){
            if(num <= 1) return 1;
            return num * recursive(num-1);
        }
    }


    public static void main(String[] args) throws IOException {
        Problem27433 problem = new Problem27433();
        problem.solution();
    }
}

