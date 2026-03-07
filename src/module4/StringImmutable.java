package module4;

public class StringImmutable {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");

        System.out.println("String after concat: " + str);

        str = str.concat(" World");
        System.out.println("After reassignment: " + str);
    }
}