package module4;

public class FinalVariableDemo {
    public static void main(String[] args) {
        final int number = 10;

        System.out.println("Final number: " + number);

        // number = 20;  // This will cause error
    }
}