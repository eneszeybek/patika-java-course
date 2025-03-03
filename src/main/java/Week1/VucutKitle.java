package Week1;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boy: ");
        double boy = scanner.nextDouble();

        System.out.println("Kilo: ");
        int kilo = scanner.nextInt();

        double vki = kilo / boy / boy;

        System.out.println("VKI: " + vki);
    }
}
