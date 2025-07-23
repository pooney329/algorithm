package progrmmers.dynamic;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/43163}
 */
public class Solution43163_3 {
    public static void main(String[] args) {
        Solution43163_3 solution43163_3 = new Solution43163_3();
        System.out.println(solution43163_3.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
//        System.out.println(solution43163_3.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        //1.출발지를 큐에 넣는다
        Queue<Word> wordQueue = new LinkedList<>();
        wordQueue.add(new Word(begin, 0));
        boolean[] visited = new boolean[words.length];
        //2.bfs로 가능한 단어 찾는다
        while (!wordQueue.isEmpty()) {
            Word word = wordQueue.poll();
            //2-1. 현재 단어가 도착지 언어인지 확인 맞으면 리턴
            if(word.word.equals(target)) {
                return word.count;
            }
            //2-2.가능 단어를 큐에 넣는다. [2~2-2] 반복 수행
            for(int i=0; i<words.length; i++){
                if(!visited[i] && isPossible(word.word, words[i])){
                    visited[i] = true;
                    wordQueue.add(new Word(words[i], word.count + 1));
                }
            }
        }
        return answer;
    }

    public boolean isPossible(String from, String to){
        int count = 0;
        for(int i=0; i<from.length(); i++){
            if(from.charAt(i) != to.charAt(i)) count++;
        }
        return count <= 1;
    }

    public static class Word {
        String word;
        int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

}
