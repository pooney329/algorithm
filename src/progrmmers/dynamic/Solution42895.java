package progrmmers.dynamic;

public class Solution42895 {

    public static void main(String[] args) {
        System.out.println(solution(5, 12));
    }


    public static int MIN = 9;
    public static String [] operation = new String []{"+","-","*", "/","++"};
    public static int solution(int N, int number) {
        int answer = 0;

        int minValue = recursive(N, 0, 0, number, 0);
        return minValue <= 8 ? minValue : -1;
    }


    public static int recursive(int number , int sum, int index,  int resultNumber , int count) {
        if(sum == resultNumber || count > 8){
            return count;
        }

        for(int i=index; i<operation.length; i++){
            String op = operation[i];
            switch (op) {
                case "+" -> sum += number;
                case "*" -> sum *= number;
                case "-" -> sum -= number;
                case "/" -> sum /= number;
                case "++" -> sum = Integer.parseInt(String.valueOf(sum) + number);
            }
            int cal = recursive(number, sum, index, resultNumber, count + 1);
            MIN = Math.min(MIN, cal);
        }
        return MIN;
    }
}
