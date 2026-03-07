package module5;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
}