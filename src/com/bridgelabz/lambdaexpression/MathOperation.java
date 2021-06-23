package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
}

public class MathOperation {
    public static void main(String[] args)   {
        //Using Method Reference instead of Lambda Expression
        //This expression implements 'IMathFunction' interface
        IMathFunction add = Integer::sum;

        //Lambda Expression for multiplication and division for 2 parameters
        //This expression implements 'IMathFunction'
        IMathFunction multiply = (x, y) -> x*y;
        IMathFunction divide = (int x, int y) -> x/y;

        //Add & Multiply two numbers using Lambda Expression
        System.out.println("Addition is : "+ add.calculate(6, 3));
        System.out.println("Multiplication is : "+multiply.calculate(5, 7));
        System.out.println("Division is : "+divide.calculate(35, 5));
    }
}
