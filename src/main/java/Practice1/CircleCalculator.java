package Practice1;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daire yarıçapı: ");
        double radius = scanner.nextDouble();

        double PI = 3.14159;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        double area2 = Math.PI * radius * radius;
        double circumference2 = 2 * Math.PI * radius;

        System.out.println("Alan: " + area + " - " +area2);
        System.out.println("Çevre: " + circumference + " - " + circumference2);
    }
}