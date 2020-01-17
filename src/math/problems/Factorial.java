package math.problems;


public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int fNum = 5;
        System.out.println(factorialRecursion(fNum));
        System.out.println(factorialIteration(fNum));
    }
    public static int factorialRecursion(int x) {

        if( x == 1)
            return 1;
        return x * factorialRecursion(x - 1);
    }

    public static int factorialIteration(int y) {

        int num = 1;
        for(int i = 1; i <= y; i++)
            num *= i;
        return num;
    }

}
