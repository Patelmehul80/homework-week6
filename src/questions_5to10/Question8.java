package questions_5to10;

import java.util.Scanner;

public class Question8 {
    float base, height, area;
    public void triangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base of the triangle:  ");
        base = input.nextFloat();
        System.out.println("Please enter height of the triangle: ");
        height= input.nextInt();
        area = (base * height)/2;
        System.out.println(" The area of the Triangle = " +area);
    }

    public static void main(String[] args) {
        Question8 obj= new Question8();
        obj.triangle();
    }
}
