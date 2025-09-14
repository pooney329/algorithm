package back.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/2075}
 */
public class Problem2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st;
        for(int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(count - 1));
    }
}
