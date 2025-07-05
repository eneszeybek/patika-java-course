package Week5.Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gün seçiniz (MONDAY, TUESDAY etc.):");
        String input = scanner.nextLine().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(input);
            System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz. Lütfen tekrar deneyin.");
        }
    }
}