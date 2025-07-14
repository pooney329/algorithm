package progrmmers.greedy;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42860}
 */
public class Solution42860 {
    public static void main(String[] args) {
        char c = 'Z';
        System.out.println(c - 'A');
        System.out.println('Z' - c + 1);
        Solution42860 solution42860 = new Solution42860();
        System.out.println(solution42860.solution("JEROEN"));
    }


    // ㅊㅁ
    public int solution(String name) {

        int count = 0;
        //최소 변환 수 구하기
        for(int i=0; i<name.length(); i++){
            count += Math.min('Z' - name.charAt(i) +1 , name.charAt(i) - 'A');
        }

        int min = name.length() - 1;
        //커서 이동 최소 구하기
        for(int i=0; i<name.length(); i++){
            int next = i+1;
            while(next < name.length() && name.charAt(next) == 'A'){
                next++;
            }

            //우로 이동 후 되돌아오기
            int right = (i * 2) + name.length() - next;
            int left = (name.length() - next) * 2 + i;
            min = Math.min(min, Math.min(right,left));
        }
        return count + min;
    }


}
