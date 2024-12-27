package mezo;

public class Solution {
//    public static int totalCount = 0;
//    public void recursive(int[] array, int index , int count , int sum, int targetCount, int t){
//        //종료
//        if(targetCount <= count){
//            if(sum <= t){
//                totalCount++;
//            }else{
//                return;
//            }
//        }
//        //시작
//        for(int i=index; i<array.length; i++){
//            recursive(array, i + 1, count + 1,  sum  + array[i], targetCount ,t );
//        }
//    }
//    public int solution(int[] arr, int k, int t) {
//        recursive(arr,0, 0, 0, k,t);
//        return totalCount;
//    }
//


    private int recursive(int[] array, int index, int count, int sum, int targetCount, int t) {
        // 종료 조건: 선택된 원소 개수가 targetCount에 도달한 경우
        if (count == targetCount) {
            return (sum <= t) ? 1 : 0;
        }

        int totalCount = 0;

        // 재귀적으로 다음 원소들을 선택
        for (int i = index; i < array.length; i++) {
            totalCount += recursive(array, i + 1, count + 1, sum + array[i], targetCount, t);
        }

        return totalCount;
    }

    public int solution(int[] arr, int k, int t) {
        return recursive(arr, 0, 0, 0, k, t);
    }

}
