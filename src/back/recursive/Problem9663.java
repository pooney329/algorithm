package back.recursive;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9663 {
    static private int count = 0;
    static private int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueen(0);
        System.out.println(count);

    }

    public static void nQueen(int depth){
        if(depth == arr.length) {
            count++;
            return;
        }


        for(int i=0; i< arr.length; i++){
            arr[depth] = i;
            if(isPossible(depth)){
                nQueen(depth + 1);
            }
        }
    }

    private static boolean isPossible(int depth) {

        for(int i=0; i<depth; i++){
            //행 비교
            if(arr[depth] == arr[i]){
                return false;
            }

            // 대각선 비교
            if(Math.abs(arr[depth] - arr[i]) == Math.abs(i - depth)){
                return false;
            }
        }
        return true;
    }
}
