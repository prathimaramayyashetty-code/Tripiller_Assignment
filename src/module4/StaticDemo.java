package module4;

class StaticDemo {

    static int count = 0;

    static void displayCount() {
        System.out.println("Count: " + count);
    }

    StaticDemo() {
        count++;
    }

    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        new StaticDemo();

        StaticDemo.displayCount();
    }
}