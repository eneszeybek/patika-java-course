package Week1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //Koda kullanıcıdan input alınacağını bildiriyoruz.
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan bir değer girmesini istiyoruz ve bu değeri year integer değişkenine atıyoruz.

        System.out.println("Lütfen bir yıl giriniz: ");
        int year = scanner.nextInt();

        //year değişkeninin artık yıl olup olmadığını if döngüsü ile kontrol ediyoruz.

        if (year%4 == 0 && (year%100 != 0 || year%400 == 0)){

        /*Koşulumuz sayının 4'e bölünebilmesi ve 100'ün katları ise 400'ün de katı olmasıdır.
        Değerimiz 100'ün katı ve 400'ün katı değilse if(1 && (0 || 0)) -> if(1 && 0) -> if(0)
        şeklinde çalışıp koşulu sağlamayacaktır.
        Değerimiz 400'ün katı ise if(1 && (0 || 1)) -> if(1 && 1) -> if(1)
        şeklinde çalışıp koşulu sağlayacaktır. */

            //Koşul sağlanıyorsa ekrana "year değeri artık yıldır." yazdırıyoruz.

            System.out.println(year + " artık yıldır.");
        }
        else {

            //Koşul sağlanmıyorsa ekrana "year değeri artık yıl değildir." yazdırıyoruz.

            System.out.println(year + " artık yıl değildir.");
        }
    }
}
