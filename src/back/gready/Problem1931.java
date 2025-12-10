package back.gready;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1931 {
    /**
     * 11
     * 1 4 (3)
     * 3 5  (2)
     * 0 6 (6)
     * 5 7 (2)
     * 3 8 (5)
     * 5 9 (4)
     * 6 10 (4)
     * 8 11 (3)
     * 8 12 (4)
     * 2 13 (11)
     * 12 14 (2)
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[][] conferences = new int[count][2];

        //배열에 회의를 담는다.
        for(int i=0; i<count; i++){
            String[] inputArray = br.readLine().split(" ");
            conferences[i][0] = Integer.parseInt(inputArray[0]);
            conferences[i][1] = Integer.parseInt(inputArray[1]);
        }

        //회의들을 종료시간 기준으로 졍렬 하면서 시작시간을 같이 비교 정렬한다 (둘다 빠른순으로)
        Arrays.sort(conferences, (o1, o2) -> {
            if (o1[1] - o2[1] == 0) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });


        int maxCount = 0;
        int preEndTime = 0;
        //종료시간 보다 뒤에 있는 회의를 선택한다.
        for(int i=0; i<conferences.length; i++){
            if(preEndTime <= conferences[i][0]){
                maxCount++;
                preEndTime = conferences[i][1];
            }
        }

        System.out.println(maxCount);
    }



}
