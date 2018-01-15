package com.wilsonfranca.challenge.evaluate.array;

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
        double numbersArray [] = new double[0];

        if(!"".equals(expr.trim())) {
            String [] expressionArray = expr.split(" ");
            for(int i = 0; i < expressionArray.length; i++) {
                String operator = expressionArray[i];
                if(operator.matches(OPERATORS)) {
                    double temp[] = new double[numbersArray.length - 1];
                    double result = pop(numbersArray, temp);
                    numbersArray = temp;
                    if(operator.matches(PLUS_OPERATOR)) {
                        temp = new double[numbersArray.length - 1];
                        result = result + pop(numbersArray, temp);
                        numbersArray = temp;
                    } else if(operator.matches(MINUS_OPERATOR)) {
                        temp = new double[numbersArray.length - 1];
                        result = pop(numbersArray, temp) - result;
                        numbersArray = temp;
                    } else if(operator.matches(POWER_OPERATOR)) {
                        temp = new double[numbersArray.length - 1];
                        result = result * pop(numbersArray, temp);
                        numbersArray = temp;
                    } else if(operator.matches(DIVISION_OPERATOR)) {
                        temp = new double[numbersArray.length - 1];
                        result = pop(numbersArray, temp) / result;
                        numbersArray = temp;
                    }
                    temp = new double[numbersArray.length + 1];
                    push(numbersArray, temp, result);
                    numbersArray = temp;
                } else {
                    double number = Double.valueOf(expressionArray[i]);
                    double temp[] = new double[numbersArray.length + 1];
                    push(numbersArray, temp, number);
                    numbersArray = temp;
                }
            }

            output = numbersArray[0];
        }

        return output;
    }

    private void push(double source[], double destination[], double value) {
        int sourceLength = source.length;
        int destinationLength = destination.length;
        for (int i = 0; i < sourceLength; i++) {
            destination[i] = source[i];
        }
        destination[destinationLength - 1] = value;
    }

    private double pop(double source[], double destination[]) {
        int sourceLength = source.length;
        for (int i = 0; i < sourceLength - 1; i++) {
            destination[i] = source[i];
        }
        double value = source[sourceLength - 1];
        return value;
    }
}
