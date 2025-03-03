package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1149 {
    static int[][] rgbArray;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        rgbArray = new int[count][3];
        visited = new boolean[count + 1];

        StringTokenizer st = null;
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                rgbArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        recursive(0,count, 0, -1);
        System.out.println(MIN);
    }


    static int MIN = Integer.MAX_VALUE;
    public static void recursive(int depth, int limit, int sum, int targetIndex) {
        if(depth ==  limit){
            MIN = Math.min(sum, MIN);
            return;
        }



        for(int i=0; i< 3; i++){
            if(targetIndex != i){
                recursive(depth + 1, limit, sum + rgbArray[depth][i], i);
            }
        }
    }
}
