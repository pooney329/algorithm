import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static class Problem4779 {

        public void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = "";
            while((input = br.readLine()) != null) {
                Integer num = Integer.parseInt(input);
                System.out.println(recursive("-".repeat((int) Math.pow(3,num))));
            }
        }

        public static String recursive(String str){
            if(str.equals("-") || str.isBlank()) return str;
            int divide = str.length() / 3;
            String left = str.substring(0,divide);
            String middle = str.substring(divide, divide*2).replaceAll("-", " ");
            String right = str.substring(divide*2 , divide*3);
            return recursive(left) + recursive(middle) + recursive(right);
        }
    }


    public static void main(String[] args) throws IOException {
        new Problem4779().solution();

    }


}



