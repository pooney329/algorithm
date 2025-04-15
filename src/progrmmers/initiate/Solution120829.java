package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120829}
 */
public class Solution120829 {
    public static void main(String[] args) {
        System.out.println(new Solution120829().solution(91));
    }

    public int solution(int angle) {
        if(0<angle && angle<90){
            return 1;
        }
        else if(angle == 90){
            return 2;
        }
        else if(90 <angle && angle <180){
            return  3;
        }
        return 4;
    }
}
