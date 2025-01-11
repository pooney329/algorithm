import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static class Problem11050 {
        public static int number = 0;
        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = null;

            int count = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            while(count --> 0){
                number = 0;
                st = new StringTokenizer(br.readLine());
                final int N = Integer.parseInt(st.nextToken());
                final int K = Integer.parseInt(st.nextToken());
                recursive(N,K);
                sb.append(number).append("\n");
            }
            System.out.println(sb);
        }

        public void recursive(int n , int k){
            if(n <= 0 || n == k )  {
                number = number + 1;
                return;
            }

            for(int i = 1; i <= k; i++){
                recursive(n-1,k-i);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Problem11050 problem = new Problem11050();
        problem.solution();
    }
}

