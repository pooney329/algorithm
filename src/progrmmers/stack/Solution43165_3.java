package progrmmers.stack;

public class Solution43165_3 {

    public static void main(String[] args) {
        Solution43165_3 Solution43165_3 = new Solution43165_3();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(Solution43165_3.solution(numbers,target));
    }
    public int solution(int[] numbers, int target) {
        return recursive(numbers,0, target, 0);
    }


    public int recursive(int[] numbers, int index, int target, int sum) {
        if(index == numbers.length) {
            return sum == target ? 1 : 0;
        }
        int plus = recursive(numbers, index + 1, target, sum + numbers[index]);
        int minus = recursive(numbers, index +1 , target, sum - numbers[index]);
        return plus + minus;
    }

}
