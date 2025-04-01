package progrmmers.greedy;


/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42862}
 */
public class Solution42862 {
    public static void main(String[] args) {
        int n = 3;
        int lost [] = new int[]{3};
        int reserve [] = new int[]{1};
        System.out.println(new Solution42862().solution(n, lost, reserve));
    }


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] realLost = new int[n + 2];
        for(int l : lost) {
            realLost[l] = 1;
        }

        int[] realReserve = new int[n+2];
        for(int r : reserve){
            if(realLost[r] == 1){
                realReserve[r] = 0;
                realLost[r] = realLost[r] - 1;
                continue;
            }
            realReserve[r] = 1;
        }

        for(int i=1; i <= n; i++){
            if(realLost[i] == 1 && realReserve[i-1] == 1) {
                realLost[i] = 0;
                realReserve[i-1] = 0;
            } else if (realLost[i] == 1 && realReserve[i+1] == 1) {
                realLost[i] = 0;
                realReserve[i+1] = 0;
            }
        }


        for(int r :realLost){
            if(r == 1){
                answer++;
            }
        }

        return n - answer;
    }


}
