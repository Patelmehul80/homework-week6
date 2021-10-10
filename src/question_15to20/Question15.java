package question_15to20;

public class Question15 {
    static int a = 25;
    static int b = 45;

    public void sets() {
        System.out.println(a - b);
        int t = a;
        a = b;
        b = t;

        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Question15 obj = new Question15();
        obj.sets();
    }
}
