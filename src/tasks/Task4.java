package tasks;

import interfaces.Executable;

public class Task4 implements Executable {
    String brackets = "[((())()(())]]";

    @Override
    public void executeTask() {

        int openingParenthesis = 0;
        int closingParenthesis = 0;
        int openingBrackets = 0;
        int closingBrackets = 0;
        for (char element : brackets.toCharArray()) {
            switch (element) {
                case '(' -> openingParenthesis++;
                case ')' -> closingParenthesis++;
                case '[' -> openingBrackets++;
                case ']' -> closingBrackets++;
            }
        }
        boolean isStartingWithOpeningBrackets = brackets.startsWith("[") || brackets.startsWith("(");
        boolean isAllBracketsEqual = openingParenthesis == closingParenthesis
                                     && openingBrackets == closingBrackets;
        if (isStartingWithOpeningBrackets && isAllBracketsEqual) {
            System.out.println("The bracket sequence is correct! Yay!");
        } else {
            System.out.println("The bracket sequence is incorrect :(" +
                               "\nIn order for the sequence to be correct the following conditions must be TRUE: " +
                               "\n1. The sequence stars with the the opening bracket/parenthesis. Your sequence: " + isStartingWithOpeningBrackets +
                               "\n2. The amount of opening brackets and parenthesis should equal the amount of closing brackets and parenthesis. Your sequence: " + isAllBracketsEqual +
                               "\nTotal:" + " '(' = " + openingParenthesis + " ')' = " + closingParenthesis + " '[' = " + openingBrackets + " ']' = " + closingBrackets);

        }
    }
}