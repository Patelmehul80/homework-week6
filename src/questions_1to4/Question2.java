package questions_1to4;

public class Question2 {
    static int age = 40;
    static String name = "Mehul";

    public static void myAge() {
        System.out.println(name);
        System.out.println(age);
        // access via class name
        System.out.println(Question2.name);
        System.out.println(Question2.age);


    }

    public static void main(String[] args) {
        myAge();
    }
}
