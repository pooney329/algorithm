package progrmmers.search;

public class Solution43165_2 {


    public static void main(String[] args) {
        Solution43165_2 Solution43165_2 = new Solution43165_2();
        int[] numbers = {1, 1, 1, 1, 1};
        System.out.println(Solution43165_2.solution(numbers, 3));
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        return recursive(numbers,0, 0, target);
    }

    public int recursive(int[] numbers, int index, int sum, int target) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        int plus = recursive(numbers, index + 1, sum + numbers[index], target);
        int minus = recursive(numbers, index + 1, sum - numbers[index], target);
        return plus + minus;
    }

}
