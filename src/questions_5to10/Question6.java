package questions_5to10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question6 {
    double radius, area;

    public void circle() {
        Question6 obj = new Question6();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius");
        obj.radius = input.nextDouble();
        obj.area = Math.PI * obj.radius * obj.radius;
        System.out.println("The area of the circle is " +obj.area);
    }

    public static void main(String[] args) {
        Question6 obj1= new Question6();
        obj1.circle();
    }
}
