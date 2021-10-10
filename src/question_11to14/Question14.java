package question_11to14;

public class Question14 {
    float w = 5.6f;
    float h = 8.5f;

    public void rectangle() {
        System.out.println("Area is " + w + " * " + h + " = " + (w * h));
        System.out.println("perimeter is 2 * (" + w + " + " + h + ") = " + (2 * (w + h)));
    }

    public static void main(String[] args) {
        Question14 obj = new Question14();
        obj.rectangle();
    }
}
