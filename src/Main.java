import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) throws IOException {
        Main main = new Main();

        int[][] ss = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(main.solution(ss));
    }


    boolean[][] visited;
    int[][] maps;

    public int solution(int[][] maps) {
        int answer = 0;

        //상하좌우
        int[] row = {1, -1, 0, 0};
        int[] col = {0, 0, -1, 1};
        visited = new boolean[maps.length + 1][maps.length + 1];
        this.maps = maps;
        //queue를
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(0, 0, 1));

        while (!queue.isEmpty()) {
            Position extractTarget = queue.poll();

            if (extractTarget.getRow() == maps.length - 1 && extractTarget.getCol() == maps.length - 1) {
                return extractTarget.count;
            }

            for (int i = 0; i < row.length; i++) {
                int nextRow = extractTarget.getRow() + row[i];
                int nextCol = extractTarget.getCol() + col[i];
                if (isAvailable(nextRow, nextCol)) {
                    visited[nextRow][nextCol] = true;
                    queue.add(new Position(nextRow, nextCol, extractTarget.count + 1));
                }
            }
        }
        return -1;
    }

    public boolean isAvailable(int row, int col) {
        if (
                (row >= 0 && row < maps.length)
                        && (col >= 0 && col < maps.length)
                        && maps[row][col] == 1
                        && !visited[row][col]) {
            return true;
        }
        return false;
    }

    public static class Position {
        private int row;
        private int col;
        private int count;

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
    }


}
