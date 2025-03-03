package Week1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boy: ");
        double height = scanner.nextDouble();

        System.out.println("Kilo: ");
        int weight = scanner.nextInt();

        double bodyMassIndex = weight / height / height;

        System.out.println("Vücut Kitle İndeksi: " + bodyMassIndex);
    }
}
