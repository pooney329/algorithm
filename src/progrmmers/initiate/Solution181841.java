package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181841}
 */
public class Solution181841 {
    public static void main(String[] args) {
        String[] strList = new String[]{"abc", "def", "ghi"};
        String ex = "ef";
        System.out.println(new Solution181841().solution(strList, ex));
    }

    public String solution(String[] str_list, String ex) {
        StringBuilder st = new StringBuilder();
        for(String str : str_list){
            if(!str.contains(ex)){
                st.append(str);
            }
        }
        return st.toString();
    }
}
