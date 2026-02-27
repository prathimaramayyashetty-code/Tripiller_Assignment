package module3;

class DemoConstructor {
    int num;

    DemoConstructor(int n) {

        num = n;
    }

    void display() {
        System.out.println("Number = " + num);
    }

    public static void main(String[] args) {
        DemoConstructor obj = new DemoConstructor(50);
        obj.display();
    }
}
