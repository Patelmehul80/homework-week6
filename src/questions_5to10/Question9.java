package questions_5to10;

import java.util.Locale;
import java.util.Scanner;

public class Question9 {
    public void cases() {
        Scanner uplo = new Scanner(System.in);
        System.out.println("Please enter the Uppercase characters:  ");
        String enter = uplo.nextLine();
        System.out.println("UPPERCASE CONVERTED TO LOWERCASE:  ");
        System.out.println(enter.toLowerCase());
    }

    public static void main(String[] args) {
        Question9 obj = new Question9();
        obj.cases();
    }
}
