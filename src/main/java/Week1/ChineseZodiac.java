package Week1;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        // Kullanıcıdan input alınacağını koda bildiriyoruz.
        Scanner scanner = new Scanner(System.in);

        /*Kullanıcıdan doğum yılı bilgisini alarak bu değeri
        yearOfBirth tamsayı değişkenine atıyoruz. */

        System.out.println("Doğum yılınızı giriniz: ");
        int yearOfBirth = scanner.nextInt();

        /* Switch-case döngüsü ile; doğum yılının 12 ile bölümünden kalanı
        hesaplayıp, değerin döngü içindeki Çin Zodyağı burç karşılığı ile eşleştirip,
        bu ismi chineseZodiac olarak tanımladığımız string değişkenine atıyoruz. */

        String chineseZodiac = switch (yearOfBirth % 12){
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Geçersiz değer girdiniz";
        };

        //Doğum yılına karşılık gelen Çiz Zodyağı burcunu ekrana yazdırıyoruz.
        System.out.println("Çin Zodyağı Burcunuz: " + chineseZodiac);
    }
}
