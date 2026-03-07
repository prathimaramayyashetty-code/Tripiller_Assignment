package module5;
class NumberThread extends Thread {
    int start;

    NumberThread(int start) {
        this.start = start;
    }

    public void run() {
        for (int i = start; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

public class AlternateNumbers {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread(1);
        NumberThread t2 = new NumberThread(2);

        t1.start();
        t2.start();
    }
}