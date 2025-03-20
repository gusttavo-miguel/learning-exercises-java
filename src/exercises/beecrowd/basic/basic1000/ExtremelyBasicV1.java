package src.exercises.beecrowd.basic.basic1000;

import java.util.Scanner;

public class ExtremelyBasicV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== INSIRA DOIS NÚMEROS INTEIROS ======");
        System.out.print("Number one: ");
        int A = scanner.nextInt();
        System.out.print("Number Two: ");
        int B = scanner.nextInt();

        int X = A + B;
        System.out.println("X = " + X);
    }
}