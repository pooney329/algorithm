package progrmmers.search;

import java.util.*;
import java.util.stream.Collectors;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/43164}
 */
public class Solution43164 {


    public static void main(String[] args) {
//        String [][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String [][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        System.out.println(Arrays.toString(new Solution43164().solution(tickets)));;
    }
    static List<String> airportArray = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        boolean visited [] = new boolean [tickets.length];
        dfs(tickets, visited, "ICN", 0, "ICN");

        List<String> collect = airportArray.stream().sorted().collect(Collectors.toList());
        return collect.get(0).split(",");
    }

    public void dfs(String[][] tickets, boolean[] visited, String keyword, int depth, String str){
        if(depth == tickets.length){
            airportArray.add(str);
            return;
        }
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && tickets[i][0].equals(keyword)){
                visited[i] = true;
                dfs(tickets, visited, tickets[i][1], depth + 1, str + "," + tickets[i][1]);;
                visited[i] = false;
            }
        }
    }
}
