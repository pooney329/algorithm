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
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(main.solution(sizes));;

    }

    public int solution(int[][] sizes) {
        int answer = 0;

        int maxWidth = 0;
        int maxHeight = 0;
        for(int[] sizeArray : sizes){
            int width = sizeArray[0];
            int height = sizeArray[1];
            maxWidth = Math.max(maxWidth, Math.max(width,height));
            maxHeight = Math.max(maxHeight,Math.min(width,height));
        }
        return maxWidth * maxHeight;
    }


}
