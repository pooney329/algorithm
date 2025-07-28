package progrmmers.stack;

import java.util.*;
import java.util.stream.Collectors;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42579}
 */
public class Solution42579 {
    public static void main(String[] args) {
        Solution42579 Solution42579 = new Solution42579();
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "sss"};
        int [] plays = {500, 600, 500, 500, 2500, 100};
        System.out.println(Arrays.toString(Solution42579.solution(genres, plays)));
    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String,Integer> genreCountMap = new HashMap<>();
        Map<String,List<Music>> playsMap = new HashMap<>();
        for(int i=0; i < genres.length; i++) {
            String genre = genres[i];
            genreCountMap.put(genre, genreCountMap.getOrDefault(genre, 0) + plays[i]);
            playsMap.putIfAbsent(genre, new ArrayList<>());
            playsMap.get(genre).add(new Music(i, plays[i]));
        }

        List<String> sortedMapList = genreCountMap.entrySet().stream().sorted((k,v) -> v.getValue() - k.getValue()).map(Map.Entry::getKey).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for(String genre : sortedMapList){
            List<Music> playCountList = playsMap.get(genre);
            Comparator<Music> comparator = (o1, o2) -> {
                if(o1.count == o2.count){
                    return o1.index - o2.index;
                }
                return o2.count - o1.count;
            };

            playCountList.sort(comparator);
            for(int i=0; i < playCountList.size(); i++){
                if(i == 2) break;
                resultList.add(playCountList.get(i).index);
            }
        }
        int[] result = new int[resultList.size()];
        for(int i=0; i<result.length; i++){
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static class Music {
        int index;
        int count;

        public Music(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }

}
