package progrmmers.greedy;

public class Solution42883 {

    public static void main(String[] args) {

        Solution42883 Solution42883 = new Solution42883();
        //10자리
        System.out.println(Solution42883.solution("4177252841", 4));
    }
    public String solution(String number, int k) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        int nextIndex = 0;
        int madeStringCount = number.length() - k;
        while(madeStringCount > 0) {

            int max = 0;
            for(int i = nextIndex; i < number.length(); i++) {
                if(max < number.charAt(i) - '0' && number.length() - (i + 1) >= madeStringCount -1) {
                    max = number.charAt(i) - '0';
                    nextIndex = i + 1;
                }
            }
            sb.append(max);
            madeStringCount -= 1;
        }


        return sb.toString();
    }


}
