package module3;

import java.util.Scanner;

public class SquareMethod {

    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Square = " + square(n));
    }
}