package question_15to20;

import java.util.Scanner;

public class Question17 {
    public static void dectobin() {
        int dec, n, i = 1, j;
        int bin[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        dec = scan.nextInt();

        n = dec;

        while (n > 0) {
            bin[i++] = n % 2;
            n = n / 2;
        }

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin[j]);
        }

    }

    public static void main(String[] args) {
        dectobin();
    }
}



