package Week1;

import java.util.Scanner;

/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/

public class Average3_4 {
    public static void main(String[] args) {

        //Koda kullanıcıdan input girileceğini bildiriyoruz.
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan input isteyip aldığımız değeri number integer değişkenine atıyoruz.
        System.out.println("Bir sayı giriniz:");
        int number = scanner.nextInt();

        /*Ortalama hesaplamak için toplam değere ve bu değerin kaç sayıdan oluştuğuna ihtiyacımız var.
        Sayıların toplamını sum integer değişkeninde, kaç adet sayı olduğunu ise counter integer değişkeninde tutacağız.
        Sonucun küsüratlı gösterilebilmesi için değerlerden en az birini double tipi değişken olarak tanımlıyoruz.
        İki değişkenin de başlangıç değeri 0 olmalı. */

        double sum = 0;
        int counter = 0;

        //for döngüsü içinde 1'den kullanıcının girdiği değere kadar olan sayıların koşulu sağlayıp sağlamadığını kontrol edeceğiz.

        for (int i=1; i<=number; i++){
            if(i%3 == 0 && i%4 == 0){

                //i değeri koşulu her sağladığında sum değeri sum+i olarak güncellenecek. Döngü sonuna kadar koşulu sağlayan tüm sayıların toplamını bu şekilde tutmuş olacağız.
                sum += i;

                //Koşul her sağlandığında counter sayacımız 1 artacak.
                counter++;
            }
        }

        //Ekrana "Girilen değer + açıklama + Ortalama(sum/counter)" bilgisini yazdırıyoruz.
        System.out.println(number + "'ye kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması = " + (sum/counter) + "'dır");
    }
}
