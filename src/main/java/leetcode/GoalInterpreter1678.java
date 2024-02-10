package leetcode;

public   class  GoalInterpreter1678 {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(GoalInterpreter1678.interpret(command));

    }
    public static String interpret(String command) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append("G");
                ++i;
            } else if (command.charAt(i + 1) == ')') {
                sb.append("o");
                i += 2;
            } else {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();


    }
    }
