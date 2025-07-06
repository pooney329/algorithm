package progrmmers.dynamic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution43163_2 {
    public static void main(String[] args) {
        Solution43163_2 solution43163_2 = new Solution43163_2();
        System.out.println(solution43163_2.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;


        Queue<Word> queue = new LinkedList<>();
        queue.add(new Word(begin,0, new boolean[words.length]));
        boolean[] visited = new boolean[words.length];
        while(!queue.isEmpty()){
            Word poll = queue.poll();
            if(poll.word.equals(target)){
                return poll.count;
            }
            for(int i=0; i<words.length; i++){
                if(!visited[i] && isTarget(words[i], poll.word)){
                    queue.add(new Word(words[i],poll.count + 1, poll.visited));
                    visited[i] = true;
                }
            }
        }
        return answer;
    }

    public boolean isTarget(String str, String target){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != target.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }
    public static class Word {
        String word;
        int count;
        boolean[] visited;

        public Word(String word, int count, boolean[] visited) {
            this.word = word;
            this.count = count;
            this.visited = visited;
        }

        public String getWord() {
            return word;
        }

        public int getCount() {
            return count;
        }
    }




}
