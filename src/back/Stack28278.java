package back;

import java.util.Stack;

public class Stack28278 {
    private final Stack<Integer> stack = new Stack<>();

    public void inputCommand(Integer command, Integer number) {
        switch (command) {
            case 1:
                firstCommand(number);
                break;
            case 2:
                twoCommand();
                break;
            case 3:
                threeCommand();
                break;
            case 4:
                fourCommand();
                break;
            case 5:
                fiveCommand();
                break;
        }
    }

    private void firstCommand(Integer number) {
        stack.add(number);
    }

    private void twoCommand() {
        int number = stack.isEmpty() ? -1 : stack.pop();
        System.out.println(number);
    }

    private void threeCommand() {
        System.out.println(stack.size());
    }

    private void fourCommand() {
        Integer number = stack.isEmpty() ? 1 : 0;
        System.out.println(number);
    }

    private void fiveCommand() {
        int number = stack.peek() == null ? -1 : stack.peek();
        System.out.println(number);
    }
}
