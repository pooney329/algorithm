package progrmmers.stack;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42576}
 */
public class Solution42576 {
    public static void main(String[] args) {
        Solution42576 Solution42576 = new Solution42576();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(Solution42576.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        for(String parti : participant){
            participantMap.put(parti, participantMap.getOrDefault(parti,0) + 1);;
        }

        for(String comp : completion){
            if(participantMap.containsKey(comp)){
                participantMap.put(comp, participantMap.get(comp)-1);
            }
        }

        return participantMap.entrySet().stream().filter(i -> i.getValue() > 0).findFirst().get().getKey();
    }

}
