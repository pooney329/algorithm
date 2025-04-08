package progrmmers.dynamic;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/1844}
 */
public class Solution1844 {

    public static void main(String[] args) {
        int maps[][] = new int[][]{
                {1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}
        };
        System.out.println(new Solution1844().solution(maps));
    }

    public int solution(int[][] maps) {
        int answer = 0;

        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(0, 0, 1));
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;
        //상 하 좌 우
        int[] rowType = new int[]{-1, 1, 0, 0};
        int[] colType = new int[]{0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Position position = queue.poll();

            if (position.row == maps.length - 1 && position.col == maps[0].length - 1) {
                return position.count;
            }

            for (int i = 0; i < 4; i++) {

                int nextRow = position.row + rowType[i];
                int nextCol = position.col + colType[i];
                if (nextRow < 0 || nextRow > maps.length -1 || nextCol < 0 || nextCol > maps[0].length - 1) {
                    continue;
                }
                if (!visited[nextRow][nextCol] && maps[nextRow][nextCol] == 1) {
                    visited[nextRow][nextCol] = true;
                    queue.add(new Position(nextRow, nextCol, position.count + 1));
                }
            }

        }
        return -1;
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

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public int getCount() {
            return count;
        }

        public void addCount(int count) {
            this.count = count + 1;
        }
    }
}
