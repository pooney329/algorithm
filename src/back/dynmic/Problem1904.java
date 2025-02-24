package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1904 {
    static int limit;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        limit = Integer.parseInt(br.readLine());
        recursive(limit);
        System.out.println(count % 15746);

    }

    public static void recursive(int depth){
        if(depth == 0){
            count++;
            return;
        }
        for(int i = 2; i> 0; i--){
            if(0 <= depth - i) {
                recursive(depth - i);
            }
        }
    }
}
