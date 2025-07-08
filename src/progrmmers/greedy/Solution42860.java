package progrmmers.greedy;

public class Solution42860 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'Y';

        Math.min((int) a + 25 - (int) b + 1, (int) b - (int) a);
        System.out.println();
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println(Math.abs((int) a- (int)b));

        Solution42860 Solution42860 = new Solution42860();
        System.out.println(Solution42860.solution("JEROEN"));
    }

    public int solution(String name) {
        int answer = 0;

        String target = "A".repeat(name.length());
        int rightCount = 0;
        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) != target.charAt(i)){
                rightCount += minCount(name.charAt(i), target.charAt(i));
            }
            if(target == name) {
                rightCount += i;
                break;
            }
        }

        int leftCount = 0;
        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) != target.charAt(i)){
                rightCount += minCount(name.charAt(i), target.charAt(i));
            }
            if(target == name) {
                rightCount += i;
                break;
            }
        }
        return rightCount;
    }

    public int minCount(char a , char b) {
        return Math.min((int) a + 25 - (int) b + 1, (int) b - (int) a);
    }

//    public void recursive(String name, String target, int cursorIdx, int count) {
//        if(name.equals(target)) {
//            return;
//        }
//        recursive(name, target, cursorIdx + 1, count);
//        recursive(name, target, name.length() - cursorIdx - 1, count);
//
//    }


}
