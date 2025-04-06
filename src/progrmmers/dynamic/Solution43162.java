package progrmmers.dynamic;

/**
 *
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/43162}
 */
public class Solution43162 {

    public static void main(String[] args) {
//        int [][] computers = new int [][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int [][] computers = new int [][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(new Solution43162().solution(3, computers));
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n+1];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                recursive(computers,i, visited, 0, n);
                answer++;
            }

        }
        return answer;
    }
    public void recursive(int[][] computers, int computerIndex, boolean[] visited, int depth, int limit){
        if(depth == limit){
            return;
        }

        for(int i=0; i<computers.length; i++){
            int searchComputerStatus = computers[computerIndex][i];
            if(!visited[i] && searchComputerStatus == 1){
                visited[i] = true;
                recursive(computers, i, visited, depth + 1, limit);
            }
        }
    }
}
