package Week1;

import java.util.Scanner;

//Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan üçgenin taban uzunluğunu belirtecek bir değer istiyoruz ve bu değeri num değişkenine atıyoruz.
        System.out.println("Bir sayı giriniz:");
        int num = scanner.nextInt();

        //ilk for döngümüz num değerinden başlayıp 1'e kadar azalarak kaç satır * yazdırılacağını belirleyecek
        for (int i=num ; i>0 ; i--){

            //ikinci for döngümüz, mevcut satıra i'nin o anki değerine kadar * yazdıracak
            for (int j=0; j<i; j++){
                System.out.print("*");
            }

            //satırda olması gereken kadar * yazıldıktan sonra alt satıra geçeceğiz.
            System.out.println();
        }
    }
}
