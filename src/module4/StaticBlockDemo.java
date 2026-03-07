package module4;
public class StaticBlockDemo {

    static {
        System.out.println("Static block executed first.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}