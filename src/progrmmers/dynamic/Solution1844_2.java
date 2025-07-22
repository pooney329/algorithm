package progrmmers.dynamic;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/1844}
 */
public class Solution1844_2 {
    public static void main(String[] args) {
        int maps[][] = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(new Solution1844_2().solution(maps));
    }

    boolean[][] visited;
    public int solution(int[][] maps) {
        int answer = 0;

        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(0, 0, 1));

        int[] rowArray = new int[]{1, -1, 0, 0};
        int[] colArray = new int[]{0, 0, 1, -1};
        visited = new boolean[maps.length][maps[0].length];
        while (!queue.isEmpty()) {
            Position poll = queue.poll();
            if(poll.row == maps.length -1 && poll.col == maps[0].length -1) {
                return poll.count;
            }
            for(int i=0; i<4; i++){
                int nextRow = poll.row + rowArray[i];
                int nextCol = poll.col + colArray[i];
                if(isPossible(nextRow, nextCol, maps)){
                    visited[nextRow][nextCol] = true;
                    queue.add(new Position(nextRow, nextCol, poll.count + 1));
                }
            }

        }
        return answer;
    }

    public boolean isPossible(int nextRow, int nextCol, int[][]maps){
        return (nextRow >= 0 && nextRow < maps.length)
                && (nextCol >= 0 && nextCol < maps[0].length)
                && maps[nextRow][nextCol] == 1
                && !visited[nextRow][nextCol];
    }

    public static class Position {
        int row;
        int col;
        int count;

        public Position(int row, int col, int count) {
            this.row = row;
            this.col = col;
            this.count = count;
        }
    }

}

