package progrmmers.stack;

import java.util.Arrays;
import java.util.HashSet;

public class Solution42577 {

    public static void main(String[] args) {
        Solution42577 solution42577 = new Solution42577();
        System.out.println(solution42577.solution(new String[]{"123", "12"}));
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        HashSet<String> phoneSet = new HashSet<>();
        //1. map을 통하여 사전을 만든다.
        for(String phone : phone_book) {
            for(int i=0; i<phone.length(); i++) {
                //1-1 사전을 만들경우 간 번호별 잘라서 사전을 구성한다.
                String subPhone = phone.substring(0, i+1);
                System.out.println(subPhone);
                if(phoneSet.contains(subPhone)){
                    return false;
                }
            }
            phoneSet.add(phone);
        }
        return answer;
    }

}
