package questions_1to4;

public class Question3 {
    int a = 20;
    static int b = 40;

    public static void qty1() {
        Question3 obj = new Question3();
        System.out.println(obj.a);
        System.out.println(b);
    }

    public void qty2() {
        System.out.println(a);
        System.out.println(Question3.b);

    }

    public static void main(String[] args) {
        Question3 obj = new Question3();
        obj.qty2();
        qty1();
    }
}

