package back.twoarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/status?user_id=hookcu329&problem_id=7785&from_mine=1}
 */
public class Problem7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Set<String> set = new HashSet<>();
        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String command = st.nextToken();
            if(command.equals("enter")) set.add(person);
            else set.remove(person);
        }
        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
