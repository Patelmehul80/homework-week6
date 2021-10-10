package questions_5to10;

public class Question5 {
    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public static String plus(String sum) {
        String plus = sum;
        return plus;
    }

    public int subtraction(int a, int b) {
        int result1 = b - a;
        return result1;
    }

    public static String minus(String sum1) {
        String minus = sum1;
        return minus;
    }

    public int multiplication(int a, int b) {
        int result2 = a * b;
        return result2;
    }

    public static String multi(String sum2) {
        String multi = sum2;
        return multi;
    }

    public int division(int a, int b) {
        int result3 = b / a;
        return result3;

    }

    public static String divide(String div) {
        String divide = div;
        return divide;
    }

    public static void main(String[] args) {
        Question5 obj = new Question5();
        int answer = obj.addition(5, 10);
        String sum = plus("Addition of 'a' and 'b'       = ");
        System.out.print(sum);
        System.out.println(answer);
        int answer1 = obj.subtraction(5, 10);
        String sum1 = minus("Subtraction of 'a' from 'b'   = ");
        System.out.print(sum1);
        System.out.println(answer1);
        int answer2 = obj.multiplication(5, 10);
        String sum2 = multi("Multiplication of 'a' and 'b' = ");
        System.out.print(sum2);
        System.out.println(answer2);
        int answer3= obj.division(5,10);
        String sum3= divide("Division of 'a' and 'b'       = ");
        System.out.print(sum3);
        System.out.println(answer3);

    }
}
