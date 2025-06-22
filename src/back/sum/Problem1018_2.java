package back.sum;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Problem1018_2 {


    private static final int BOARD_ROW_COL = 8;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ROW = Integer.parseInt(st.nextToken());
        int COl = Integer.parseInt(st.nextToken());

        //체스판을 만든다
        String[] board = new String[ROW];
        for(int i=0; i<ROW; i++){
            board[i] = br.readLine();
        }


        //8개의 체스판을 구성한다
        int MIN = Integer.MAX_VALUE;
        for(int i=0; i <= ROW - BOARD_ROW_COL; i++){
            for(int j=0; j <= COl - BOARD_ROW_COL; j++){
                int count = calculateBoard(board, i, j);
                MIN = Math.min(count, MIN);
            }
        }

        System.out.println(MIN);
    }


    public static int calculateBoard(String[] board, int row, int col) {
        String[] WHITE = {"WBWBWBWB", "BWBWBWBW"};
        String[] BLACK  = {"BWBWBWBW","WBWBWBWB"};
        int whiteCount = 0;
        int blackCount = 0;
        for(int i=row; i< row + BOARD_ROW_COL; i++){
            for(int j=col; j< col + BOARD_ROW_COL; j++){
                if(WHITE[i % 2].charAt(j % BOARD_ROW_COL) != board[i].charAt(j)) whiteCount++;
                if(BLACK[i % 2].charAt(j % BOARD_ROW_COL) != board[i].charAt(j)) blackCount++;
            }
        }
        return Math.min(whiteCount,blackCount);
    }
}
