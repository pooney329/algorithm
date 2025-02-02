package back.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@link https://www.acmicpc.net/problem/2447}
 */

public class Problem2447 {

    private static char[][] blockArray;

    public static void main(String[] args) throws IOException {
        solution();
    }


    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        blockArray = new char[N][N];
        printStar(0,0, N, false);

        StringBuilder sb = new StringBuilder();
//        for(int i=0; i< blockArray.length; i++){
//            for(int j=0; j< blockArray.length; j++){
//                sb.append(blockArray[i][j]);
//            }
//            sb.append("\n");
//        }
//
        for(char[] arr : blockArray){
            for(char c : arr){
                sb.append(c);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void printStar(int x, int y, int N, boolean isBlank){
        //종료
        if(isBlank){
            for(int i=x; i<x+N; i++){
                for(int j=y; j<y+N; j++){
                    blockArray[i][j] = ' ';
                }
            }
            return;
        }


        if(N==1) {
            blockArray[x][y] = '*';
            return;
        }

        //재귀 호출
        int blockSize = N / 3;
        int count = 0;
        for(int i=x; i < x + N;  i+=blockSize){
            for(int j=y; j< y + N; j+=blockSize){
                printStar(i,j,blockSize, count++ == 4);
            }
        }
    }
}
