package module3;

class EncapsulationDemo {

    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setName("Anita");
        obj.setAge(20);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}