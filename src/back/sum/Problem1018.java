package back.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/1018}
 */
public class Problem1018 {
    public static String[] blackBoard = new String[]{"BWBWBWBW", "WBWBWBWB"};
    public static String[] whiteBoard = new String[]{"WBWBWBWB", "BWBWBWBW"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();

        }

        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int blackCount = getBlackFind(i, j, board);
                int whiteCount = getWhiteFind(i, j, board);
                if (blackCount < whiteCount) {
                    MIN = Math.min(MIN, blackCount);
                }
                MIN = Math.min(MIN, whiteCount);
            }
        }
        System.out.println(MIN);
    }


    public static int getBlackFind(int startIdx, int endIdx, String[] board) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            int tStart = startIdx + i;
            for (int j = 0; j < 8; j++) {
                int tEnd = endIdx + j;
                if (board[tStart].charAt(tEnd) != blackBoard[i % 2].charAt(j)) count++;
            }
        }
        return count;
    }

    public static int getWhiteFind(int startIdx, int endIdx, String[] board) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            int tStart = startIdx + i;
            for (int j = 0; j < 8; j++) {
                int tEnd = endIdx + j;
                if (board[tStart].charAt(tEnd) != whiteBoard[i % 2].charAt(j)) count++;
            }
        }
        return count;
    }
}
