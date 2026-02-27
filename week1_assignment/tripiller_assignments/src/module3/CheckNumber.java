package module3;

import java.util.Scanner;

public class CheckNumber {

    static void check(int num) {
        if(num > 0)
            System.out.println("Positive");
        else if(num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        check(n);
    }
}