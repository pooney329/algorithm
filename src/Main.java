import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] Cost;
    static int[][] DP;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        int n = 3;
//        int[][] computers = {
//                {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
//        };

        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(main.solution(n, computers));
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                search(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }

    public void search(int[][] computers, int index, boolean[] visited){
        for(int i=0; i<computers[index].length; i++){
            int v = computers[index][i];
            if(!visited[i] && v == 1){
                visited[i] = true;
                search(computers, i, visited);
            }
        }
    }

}
