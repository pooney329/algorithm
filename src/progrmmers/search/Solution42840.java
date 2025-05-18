package progrmmers.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42840}
 */
public class Solution42840 {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answerList = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (one[i % one.length] == answers[i]) {
                answerList[0]++;
            }
            if (two[i % two.length] == answers[i]) {
                answerList[1]++;
            }
            if (three[i % three.length] == answers[i]) {
                answerList[2]++;
            }
        }


        int maxValue = Arrays.stream(answerList).max().getAsInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < answerList.length; i++) {
            if (maxValue == answerList[i]) {
                list.add(i + 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
