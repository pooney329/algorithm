package progrmmers.dynamic;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@link  https://school.programmers.co.kr/learn/courses/30/lessons/43163}
 */
public class Solution43163 {


    public static void main(String[] args) {
        String str = "hot";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.substring(0, i) + "." + str.substring(i + 1));
//        }
        System.out.println(str.matches("h.t"));


        String begin = "hit";
        String target = "cog";
        String words[] = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(new Solution43163().solution(begin, target, words));
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        queue.add(new Node(begin,0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if(node.str.equals(target)){
                return node.count;
            }
            for (int i = 0; i < node.str.length(); i++) {
                String substring = reStr(node.str, i);
                for (int j = 0; j < words.length; j++) {
                    if(!visited[j] && words[j].matches(substring)){
                        visited[j] = true;
                        queue.add(new Node(words[j], node.count+ 1));
                    }
                }
            }
        }
        return 0;
    }

    public static class Node{
        String str;
        int count;

        public Node(String str, int count) {
            this.str = str;
            this.count = count;
        }
    }

    public String reStr(String str, int i) {
        return str.substring(0, i) + "." + str.substring(i + 1);
    }

}
