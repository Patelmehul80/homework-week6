package questions_5to10;

import java.util.Scanner;

public class Question7 {
    public static void temp() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter degree in Fahrenheit ");
        double fh = ip.nextDouble();
        double cl = ((fh - 32) / 1.8);
        System.out.println(fh + " degree is equal to " + cl + " degree celsius");

    }

    public static void main(String[] args) {
        temp();
    }
}
