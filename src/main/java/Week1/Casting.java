package Week1;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int integer = scanner.nextInt();

        System.out.println("Bir ondalıklı sayı giriniz: ");
        double decimal = scanner.nextDouble();

        double integerToDouble = (double) integer;
        int doubleToInteger = (int) decimal;

        System.out.println("Tam sayının ondalıklı sayı hali: " + integerToDouble);
        System.out.println("Ondalıklı sayının tam sayı hali: " + doubleToInteger);

        scanner.close();
    }
}
