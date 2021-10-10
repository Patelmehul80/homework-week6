package questions_1to4;

public class Question4 {
    int id = 12;
    String firstName = "Mehul";
    static String lastName = "Patel";
    static String email = "abc@gmail.com";

    public void qty1() {
        System.out.println(id);
        System.out.println(firstName);
        System.out.println(Question4.lastName);
        System.out.println(Question4.email);
    }

    public static void qty2() {
        Question4 obj = new Question4();
        System.out.println(obj.id);
        System.out.println(obj.firstName);
        System.out.println(lastName);
        System.out.println(email);
    }

    public static void main(String[] args) {
        Question4 obj = new Question4();
        obj.qty1();
        qty2();
    }

}
