package back.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCommand = Integer.parseInt(br.readLine());
        CommandStack commandStack = new CommandStack();

        while (totalCommand-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (st.hasMoreTokens()) {
                commandStack.execute(command, Integer.parseInt(st.nextToken()));
            } else {
                commandStack.execute(command, 0);
            }
        }
        System.out.println(commandStack.sb);
    }

    public static class CommandStack {
        private Stack<Integer> stack = new Stack<>();
        public StringBuilder sb = new StringBuilder();

        public CommandStack() {
        }

        public void execute(int cmd, int number) {
            switch (cmd) {
                case 1:
                    addCommand(number);
                    break;
                case 2:
                    popCommand();
                    break;
                case 3:
                    printSize();
                    break;
                case 4:
                    printEmpty();
                    break;
                case 5:
                    printPeek();
                    break;
            }
        }

        public void addCommand(int number) {
            stack.add(number);
        }

        public void popCommand() {
            sb.append(stack.isEmpty() ? "-1" : stack.pop())
                    .append("\n");
        }

        public void printSize() {
            sb.append(stack.size())
                    .append("\n");
        }

        public void printEmpty() {
            sb.append(stack.isEmpty() ? 1 : 0)
                    .append("\n");
        }

        public void printPeek() {
            sb.append(stack.isEmpty() ? -1 : stack.peek())
                    .append("\n");
        }

    }


}
