package progrmmers.stack;

import java.util.Stack;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/12909}
 */
public class Solution12909 {
    public static void main(String[] args) {
        Solution12909 Solution12909 = new Solution12909();
        String s = ")()(";
        System.out.println(Solution12909.solution(s));
    }

    boolean solution(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();

        for(String val : s.split("")){
            if(val.equals("(")){
                stack.add("(");
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return answer;
    }

}
