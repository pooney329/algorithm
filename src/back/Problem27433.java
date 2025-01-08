package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *   타입이 중요한 문제이다. int타입의 경우 범위 초과하기 때문에 long 타입으로 해야한다.
 *  {@link https://www.acmicpc.net/problem/27433}
 */
public class Problem27433 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recursive(N));
    }

    public long recursive(long num) {
        if (num <= 1) return 1;
        return num * recursive(num - 1);
    }
}
