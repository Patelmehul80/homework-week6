package question_15to20;

import java.util.Scanner;

public class Question16 {
    public void binary(){
        Scanner bt= new Scanner(System.in);
        System.out.println("Please enter 1st binary number: ");
        String a= bt.next();
        System.out.println("Please enter 2nd binary number: ");
        String b= bt.next();
        int n1= Integer.parseInt(a, 2);
        int n2= Integer.parseInt(b, 2);
        int t= n1+n2;
        System.out.println("n1 : "+Integer.toBinaryString(n1));
        System.out.println("n2 : "+Integer.toBinaryString(n2));
        System.out.println("t =n1+n2 :"+Integer.toBinaryString(t));
    }

    public static void main(String[] args) {
        Question16 obj=new Question16();
        obj.binary();
    }
}
