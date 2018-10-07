/*
Exercise 1:
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, print to console true if one or the other is teen, but not both.
Example:
int a = 1;
int b = 13;

if a or b is "teen" print "teen"
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int numA = reader.nextInt();

        System.out.print("Enter second number: ");
        int numB = reader.nextInt();

        if(checkIfTeen(numA, numB)) System.out.println("teen");
    }

    public static boolean checkIfTeen(int numA, int numB) {
        boolean isTeen = false;

        if (numA >= 13 && numA <= 19) {
            if (numB >= 13 && numB <= 19) {
                isTeen = false;
            } else {
                isTeen = true;
            }
        } else {
            if (numB >= 13 && numB <= 19) {
                isTeen = true;
            } else {
                isTeen = false;
            }
        }

        return isTeen;
    }
}