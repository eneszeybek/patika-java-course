package Week2;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number,2)) {
            System.out.println(number + " asal sayıdır");
        } else {
            System.out.println(number + " asal sayı değildir");
        }
        scanner.close();
    }

    public static boolean isPrime(int number, int divisor) {
        if(number < 2){
            return false;
        }
        if(divisor > Math.sqrt(number)) {
            return true;
        }
        if(number%divisor == 0){
            return false;
        }
        return isPrime(number, divisor + 1);

    }
}