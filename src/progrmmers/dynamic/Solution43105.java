package progrmmers.dynamic;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/43105}
 */
public class Solution43105 {
    public static void main(String[] args) {
        Solution43105 solution43105 = new Solution43105();
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution43105.solution(triangle));
    }

    public static int[][] dp;
    public static int MAX = -1;
    public int solution(int[][] triangle) {
        int answer = 0;
        dp = new int[triangle.length][triangle.length];
        for(int i=1; i<triangle[0].length; i++){
            dp[0][i] = 0;
        }
        dp[0][0] = triangle[0][0];
        for(int i=0; i<triangle[triangle.length-1].length; i++){
            MAX = Math.max(MAX, recursive(triangle, triangle.length -1, i));
        }
        return MAX;
    }
    public int recursive(int[][] triangle, int row, int col){
        if(row < 0 || col < 0 || col - row  > 0) {
            return 0;
        }

        if(dp[row][col] == 0){
            int max = Math.max(recursive(triangle, row - 1, col - 1), recursive(triangle, row - 1, col));
            dp[row][col] =  max + triangle[row][col];
        }
        return dp[row][col];
    }
}
