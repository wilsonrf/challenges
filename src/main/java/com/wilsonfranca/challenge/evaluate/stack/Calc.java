package com.wilsonfranca.challenge.evaluate.stack;

import java.util.Stack;

/**
 * Created by wilson on 14/01/18.
 */
public class Calc {

    private static final String OPERATORS = "[/+-/*//]";
    private static final String PLUS_OPERATOR = "[+]";
    private static final String MINUS_OPERATOR = "[-]";
    private static final String POWER_OPERATOR = "[*]";
    private static final String DIVISION_OPERATOR = "/";

    public double evaluate(String expr) {
        // TODO: Your code here
        double output = 0;
        Stack<Double> doubleStack = new Stack<>();

        if(!"".equals(expr.trim())) {
            String [] expressionArray = expr.split(" ");
            for(int i = 0; i < expressionArray.length; i++) {
                String operator = expressionArray[i];
                if(operator.matches(OPERATORS)) {
                    double result = doubleStack.pop();
                    if(operator.matches(PLUS_OPERATOR)) {
                        result = result + doubleStack.pop();
                    } else if(operator.matches(MINUS_OPERATOR)) {
                        result = doubleStack.pop() - result;
                    } else if(operator.matches(POWER_OPERATOR)) {
                        result = result * doubleStack.pop();
                    } else if(operator.matches(DIVISION_OPERATOR)) {
                        result = doubleStack.pop() / result;
                    }
                    doubleStack.push(result);
                } else {
                    double number = Double.valueOf(expressionArray[i]);
                    doubleStack.push(number);
                }
            }

            output = doubleStack.pop();
        }

        return output;
    }
}