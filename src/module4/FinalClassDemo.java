package module4;

final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}