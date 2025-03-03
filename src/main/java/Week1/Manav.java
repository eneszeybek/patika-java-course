package Week1;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kaç kg: ");
        int armut = scanner.nextInt();

        System.out.println("Elma kaç kg: ");
        int elma = scanner.nextInt();

        System.out.println("Domates kaç kg: ");
        int domates = scanner.nextInt();

        System.out.println("Muz kaç kg: ");
        int muz = scanner.nextInt();

        System.out.println("Patlıcan kaç kg: ");
        int patlican = scanner.nextInt();

        double armutTL = 2.14;
        double elmaTL = 3.67;
        double domatesTL = 1.11;
        double muzTL = 0.95;
        double patlicanTL = 5;

        System.out.println("Toplam Fiyat: " + (armutTL*armut + elmaTL*elma + domatesTL*domates + muzTL*muz + patlicanTL*patlican));
    }
}
