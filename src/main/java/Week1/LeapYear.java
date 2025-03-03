package Week1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir yıl giriniz: ");
        int year = scanner.nextInt();

        if (year%400 == 0){
            System.out.println(year + " artık yıldır.");
        }
        else if (year%100 == 0){
            System.out.println(year + " artık yıl değildir.");
        }
        else if (year%4 == 0){
            System.out.println(year + " artık yıldır.");
        }
        else {
            System.out.println(year + " artık yıl değildir.");
        }
    }
}
