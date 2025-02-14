package back.recursive;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * {@link https://www.acmicpc.net/problem/14888}
 */
public class Problem14888 {

    static int[] arr;
    static int[] operator;
    static int[] out;
    static int max = 0;
    static int min = 1;

    /**
     * 예제 입력 1
     * 2
     * 5 6
     * 0 0 1 0
     * 예제 출력 1
     * 30
     * 30
     *
     *
     *
     * 3
     * 3 4 5
     * 1 0 1 0
     * 35 , 17
     *
     *
     * 6
     * 1 2 3 4 5 6
     * 2 1 1 1
     * 54,-24
     *
     *
     *
     *
     * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
     * 2 초	512 MB	119079	55059	36579	47.054%
     * 문제
     * N개의 수로 이루어진 수열 A1, A2, ..., AN이 주어진다. 또, 수와 수 사이에 끼워넣을 수 있는 N-1개의 연산자가 주어진다. 연산자는 덧셈(+), 뺄셈(-), 곱셈(×), 나눗셈(÷)으로만 이루어져 있다.
     *
     * 우리는 수와 수 사이에 연산자를 하나씩 넣어서, 수식을 하나 만들 수 있다. 이때, 주어진 수의 순서를 바꾸면 안 된다.
     *
     * 예를 들어, 6개의 수로 이루어진 수열이 1, 2, 3, 4, 5, 6이고, 주어진 연산자가 덧셈(+) 2개, 뺄셈(-) 1개, 곱셈(×) 1개, 나눗셈(÷) 1개인 경우에는 총 60가지의 식을 만들 수 있다. 예를 들어, 아래와 같은 식을 만들 수 있다.
     *
     * 1+2+3-4×5÷6
     * 1÷2+3+4-5×6
     * 1+2÷3×4-5+6
     * 1÷2×3-4+5+6
     * 식의 계산은 연산자 우선 순위를 무시하고 앞에서부터 진행해야 한다. 또, 나눗셈은 정수 나눗셈으로 몫만 취한다. 음수를 양수로 나눌 때는 C++14의 기준을 따른다. 즉, 양수로 바꾼 뒤 몫을 취하고, 그 몫을 음수로 바꾼 것과 같다. 이에 따라서, 위의 식 4개의 결과를 계산해보면 아래와 같다.
     *
     * 1+2+3-4×5÷6 = 1
     * 1÷2+3+4-5×6 = 12
     * 1+2÷3×4-5+6 = 5
     * 1÷2×3-4+5+6 = 7
     * N개의 수와 N-1개의 연산자가 주어졌을 때, 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.
     *
     */

    /**
     * @throws IOException 1, 2, 3, 4, 5, 6이고, 주어진 연산자가 덧셈(+) 2개, 뺄셈(-) 1개, 곱셈(×) 1개, 나눗셈(÷) 1개인 경우에는
     */
    public static void main(String[] args) throws IOException {

        System.out.println(1 / 2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());

        //배열에 수열 넣기
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min *= arr[i];
        }


        //연산자 정의하기
        operator = new int[4];
        out = new int[count - 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operator.length; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
        recusive(0, 0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void recusive(int start, int depth) {
        if (depth == out.length) {
            calculator();
            return;
        }

        for (int i = start; i < operator.length; i++) {
            if (operator[i] > 0) {
                operator[i] = operator[i] - 1;
                out[depth] = i;
                recusive(start, depth + 1);
                operator[i] = operator[i] + 1;
            }
        }

    }

    public static void calculator() {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int op = out[i - 1];
            if (op == 0) {
                sum += arr[i];
            } else if (op == 1) {
                sum -= arr[i];
            } else if (op == 2) {
                sum *= arr[i];
            } else {
                sum /= arr[i];
            }
        }
        //최댓값
        if (sum > max) {
            max = sum;
        }

        //최솟값
        if (sum < min) {
            min = sum;
        }
    }


}
