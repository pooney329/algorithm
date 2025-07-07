package progrmmers.greedy;

public class Solution42860 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';

        System.out.println(Math.abs((int) a- (int)b));

        Solution42860 Solution42860 = new Solution42860();
        System.out.println(Solution42860.solution("JEROEN"));
    }

    public static int[] function = new int[]{1,2,3,4};
    public int solution(String name) {
        int answer = 0;
        return answer;
    }

    public void recursive(String str, String target, int cursorIndex, int count) {
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != target.charAt(i)){
                if(i == 0){
                    int cursorCount = Math.abs((int) str.charAt(i)- (int) target.charAt(i));
                    recursive(str.substring(1), target.substring(1), cursorIndex, count + cursorCount);
                }
            }
            else{

            }
        }


    }
}
