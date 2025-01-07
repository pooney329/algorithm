import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static class Problem10872 {

        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            System.out.println(recursive(N));
        }

        public int recursive(int num){
            if(num <= 1) return 1;
            return num * recursive(num-1);
        }
    }


    public static void main(String[] args) throws IOException {
        Problem10872 problem = new Problem10872();
        problem.solution();
    }
}

