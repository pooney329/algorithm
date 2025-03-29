package progrmmers.sort;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42746}
 */
public class Solution42746 {


    public static void main(String[] args) {
        int [] numbers = new int[]{3, 30, 34, 5, 9};
        System.out.println(new Solution42746().solution(numbers));
    }


    public static String max = "";

    public String solution(int[] numbers) {
        String answer = "";
        boolean[] visited = new boolean[numbers.length];
        int [] result = new int[numbers.length];
        recursive(0, visited, numbers, "");
        return max;
    }

    public void recursive(int index, boolean[] visited,  int[] numbers, String result){
        if(index == numbers.length){
            if(max.compareTo(result) < 0){
                max = result;
            }
            return;
        }

        for(int i=0; i<numbers.length; i++){
            if(index == 0 && numbers[i] == 0){
                continue;
            }
            if(!visited[i]){
                visited[i] = true;
                recursive(index + 1 , visited, numbers, result + numbers[i]);
                visited[i] = false;
            }
        }
    }

}
