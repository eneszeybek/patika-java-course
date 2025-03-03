package Week1;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a değerini giriniz: ");
        int a = scanner.nextInt();

        System.out.println("b değerini giriniz: ");
        int b = scanner.nextInt();

        System.out.println("c değerini giriniz: ");
        int c = scanner.nextInt();

        int result = a + b * c - b;
        System.out.println("a+b*c-b = " + result);
    }
}
