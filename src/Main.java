import com.sun.jdi.Value;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Main main = new Main();

        int[] numbers = new int[]{3, 30, 34, 5, 9};
        System.out.println(main.solution(numbers));
    }


    public String solution(int[] numbers) {
        String answer = "";

        String[] convertArray = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            convertArray[i] = String.valueOf(numbers[i]);
        }
       Comparator<String> comparator = new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2);
           }
       };
        Arrays.sort(convertArray, comparator);
        return String.join("", convertArray);
    }




}
