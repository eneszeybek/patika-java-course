package Week2;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x^y değerini bulmak için x değerini giriniz: ");
        double number = scanner.nextDouble();
        System.out.println("y değerini giriniz: ");
        double power = scanner.nextDouble();

        System.out.println("Sonuç: " + Math.pow(number, power));
    }
}
