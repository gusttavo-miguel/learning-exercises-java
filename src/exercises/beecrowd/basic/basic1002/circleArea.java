package src.exercises.beecrowd.basic.basic1002;

import java.util.Scanner;
import java.util.Locale;

public class circleArea {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double n = 3.14159;
        double ray;

        ray = scanner.nextDouble();
        System.out.printf("A=%.4f",Math.pow(ray,2)*n);
    }

}