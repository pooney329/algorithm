package progrmmers.search;

/**
 *
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/86491}
 *
 */
public class Solution86491 {


    public static void main(String[] args) {
        int sizes [][] = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(new Solution86491().solution(sizes));
    }



    public int solution(int[][] sizes) {
        Integer maxWidth = 0;
        Integer maxHeight = 0;
        for(int [] size : sizes){
            int width = size[0];
            int height = size[1];
            int tempWidth = Math.max(width, height);
            int tempHeight = Math.min(width, height);
            maxWidth = Math.max(maxWidth, tempWidth);
            maxHeight = Math.max(maxHeight, tempHeight);
        }
        return maxWidth * maxHeight;
    }
    //두번째 풀이 방법
    public int solution2(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        for(int[] sizeArray : sizes){
            int width = sizeArray[0];
            int height = sizeArray[1];
            maxWidth = Math.max(maxWidth, Math.max(width,height));
            maxHeight = Math.max(maxHeight,Math.min(width,height));
        }
        return maxWidth * maxHeight;
    }

}
