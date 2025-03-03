package Practice;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ad: ");
        String name = scanner.nextLine();

        System.out.println("Yaş: ");
        int age = scanner.nextInt();

        System.out.println("Merhaba " + name + ", " + age + " yaşındasın");

        scanner.close();
    }
}
