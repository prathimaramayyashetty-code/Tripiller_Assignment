package module4;
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("World");

        System.out.println("Result: " + sb.toString());
    }
}