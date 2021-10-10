package question_11to14;

import java.util.Scanner;

public class Question13 {
    double a, b, c, avg;


    public static void avg() {
        Question13 obj = new Question13();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        obj.a = input.nextDouble();
        System.out.println("Enter second number: ");
        obj.b = input.nextDouble();
        System.out.println("Enter third number:  ");
        obj.c = input.nextDouble();
        obj.avg = ((obj.a + obj.b + obj.c) / 3);
        System.out.println("Average:" + obj.avg);


    }

    public static void main(String[] args) {
        avg();
    }
}
