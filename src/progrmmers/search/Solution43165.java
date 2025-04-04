package progrmmers.search;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/43165}
 */
public class Solution43165 {

    public static void main(String[] args) {
        int[] numbers = new int [] {4, 1, 2, 1};
        int target = 4;
        System.out.println(new Solution43165().recursive(numbers, target, 0, 0));
    }
    public int solution(int[] numbers, int target) {
        return recursive(numbers, target, 0, 0);
    }


    public int recursive(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            return (sum == target) ? 1 : 0;
        }

        //더하기
        int one = recursive(numbers, target, depth + 1, sum + numbers[depth]);
        //마이너스
        int two = recursive(numbers, target, depth + 1, sum - numbers[depth]);
        return one + two;
    }

}
