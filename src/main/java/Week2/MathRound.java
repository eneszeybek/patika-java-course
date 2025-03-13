package Week2;

import java.util.Scanner;

public class MathRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        double number = scanner.nextDouble();

        System.out.println("Yukarı yuvarlanmış hali: " + (int)Math.ceil(number));
        System.out.println("Aşağı yuvarlanmış hali: " + (int)Math.floor(number));
        System.out.println("En yakın tamsayı: " + Math.round(number));

        scanner.close();

    }
}
