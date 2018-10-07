/*
Exercise 2:
Given 3 int values, a b c, print to console their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
Example:
int a = 1;
int b = 13;
int c = 2;

should print 1
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int numA = reader.nextInt();

        System.out.print("Enter 2nd number: ");
        int numB = reader.nextInt();

        System.out.print("Enter 3rd number: ");
        int numC = reader.nextInt();

        System.out.print("Sum: " + sumValuesExcept13(numA, numB, numC));
    }

    public static int sumValuesExcept13(int numA, int numB, int numC) {
        int sum = 0;
        if (numA != 13) {
            sum += numA;
        } else {return sum;};
        
        if (numB != 13) {
            sum += numB;
        } else {return sum;};

        if (numC != 13) {
            sum += numC;
        } else {return sum;};

        return sum;
    }
}