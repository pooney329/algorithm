package back.dynmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


/**

 */
public class Problem2579 {

    static int[] stairs; // 계단 점수 저장
    static int[] dp; // 메모이제이션 DP 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 계단 개수
        stairs = new int[n + 1]; // 계단 점수 (1-based index)
        dp = new int[n + 1]; // 최대 점수 저장 (초기값 -1로 설정)

        // 계단 점수 입력 받기
        for (int i = 1; i <= n; i++) {
            stairs[i] = sc.nextInt();
            dp[i] = -1; // DP 배열 초기화
        }

        sc.close();

        // 결과 출력
        System.out.println(getMaxScore(n));
    }

    // 재귀 + 메모이제이션을 이용한 최대 점수 구하기
    static int getMaxScore(int i) {
        if (i == 0) return 0; // 시작점
        if (i == 1) return stairs[1]; // 첫 번째 계단
        if (i == 2) return stairs[1] + stairs[2]; // 첫 번째 + 두 번째 계단

        // 이미 계산한 값이면 반환 (메모이제이션)
        if (dp[i] != -1) return dp[i];

        // 점화식 적용 (이전 두 계단을 거치는 두 가지 경우 중 최댓값 선택)
        dp[i] = Math.max(getMaxScore(i - 2) + stairs[i], getMaxScore(i - 3) + stairs[i - 1] + stairs[i]);

        return dp[i]; // 최대 점수 반환
    }


}
