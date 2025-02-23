package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/9184 }
 * 나는 아래와 같이 풀었지만 굉장히 비효율적인 방식이다.
 * [문제]
 *  1. 문자열로 바꾸는데 성능 이슈
 *  2. Map은 결국 해싱함수를 사용하기 때문에 아무리 빨라도 배열 보다 빠를 수 없다.
 *      - 배열은 O(1)의 속도 해싱함수는 해싱함수를 수행하는데 걸리는 시간 + 값이 없으때의 처리사간 이 소요
 *  3. 3차원 배열을 생각하지 못 했다.
 *
 */
public class Problem9184 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String s;
        while (!(s = br.readLine()).equals("-1 -1 -1")) {
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append("w(")
                    .append(a).append(", ")
                    .append(b).append(", ")
                    .append(c).append(")")
                            .append(" = ").append(w(a, b, c))
                    .append("\n");
        }
        System.out.println(sb);

    }

    static Map<String, Integer> map = new HashMap<>();

    public static int w(int a, int b, int c) {
        StringBuilder sb = new StringBuilder().append(a).append("|").append(b).append("|").append(c);

        if (map.containsKey(sb.toString())) {
            return map.get(sb.toString());
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {

            int w = w(20, 20, 20);
            map.put(sb.toString(),w);
            return w;
        }

        int w;
        if (a < b && b < c) {
            w = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            w = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
        map.put(sb.toString(),w);
        return w;
    }
}
