package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
    static void printResult(int a, int b, String function, IMathFunction fobj){
        System.out.println("Result of " + function+ "is"+fobj.calculate(a, b));
    }
}

public class MathOperation {
    public static void main(String[] args) {
        //Using Method Reference instead of Lambda Expression
        //This expression implements 'IMathFunction' interface
        IMathFunction add = Integer::sum;

        //Lambda Expression for multiplication and division for 2 parameters
        //This expression implements 'IMathFunction'
        IMathFunction multiply = (x, y) -> x * y;
        IMathFunction divide = (int x, int y) -> x / y;

        //Passing Lambda Expression as Function Parameter to Print Result using Static Method
        IMathFunction.printResult(4, 6, "Addition", add);
        IMathFunction.printResult(5, 3, "Multiplication", multiply);
        IMathFunction.printResult(24, 6, "Division", divide);
    }
}
