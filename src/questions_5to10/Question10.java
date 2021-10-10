package questions_5to10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        multiplicationtable();
    }

    public static void multiplicationtable() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the table number: ");
        int number = scan.nextInt();

        System.out.println(number + " * " + 1 + " = " + (number * 1));
        System.out.println(number + " * " + 2 + " = " + (number * 2));
        System.out.println(number + " * " + 3 + " = " + (number * 3));
        System.out.println(number + " * " + 4 + " = " + (number * 4));
        System.out.println(number + " * " + 5 + " = " + (number * 5));
        System.out.println(number + " * " + 6 + " = " + (number * 6));
        System.out.println(number + " * " + 7 + " = " + (number * 7));
        System.out.println(number + " * " + 8 + " = " + (number * 8));
        System.out.println(number + " * " + 9 + " = " + (number * 9));
        System.out.println(number + " * " + 10 + " = " + (number * 10));

    }
}
