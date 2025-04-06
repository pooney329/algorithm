package progrmmers.sort;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/17681}
 */
public class Solution17681 {
    public static void main(String[] args) {
//        System.out.println(String.format(format)Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(22));
        int n = 6;
        int [] arr1 = new int[]{46, 33, 33 ,22, 31, 50};
        int [] arr2 = new int[]{27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(new Solution17681().solution(n, arr1, arr2)));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String one = Integer.toBinaryString(arr1[i]);
            String two = Integer.toBinaryString(arr2[i]);
            one = one.length() == n ? one : "0".repeat(n- one.length()).concat(one);
            two = two.length() == n ? two : "0".repeat(n- two.length()).concat(two);
            StringBuilder sb = new StringBuilder();
            for(int k = 0; k < n; k++){
                if(one.charAt(k) == '1' || two.charAt(k) == '1'){
                    sb.append("#");
                }
                else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }

}
