package Week1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan kaç sayı gireceği bilgisini alarak num değişkenimize atıyoruz.
        System.out.println("Kaç tane sayı gireceksiniz? ");
        int num = scanner.nextInt();

        //girilecek sayı boyutunda numbers adında bir dizi tanımlıyoruz.
        int[] numbers = new int[num];

        //döngü ile değerleri kullanıcıdan alarak numbers dizisine sırayla atıyoruz.
        for(int i=0; i<num; i++){
            System.out.println(i+1 + ". Sayıyı giriniz");
            numbers[i] = scanner.nextInt();
        }

        //sonrasında büyüklük küçüklük karşılaştırması yapabilmek için min ve max değişkenleri tanımlayıp
        //dizinin ilk değerini bu değişkenlere atıyoruz.

        int minValue = numbers[0];
        int maxValue = numbers[0];

        for(int i=0; i<num; i++){
            //ilk iterasyonda minValue ve maxValue değerleri numbers[0] değerine eşit olduğu için if döngülerine
            //girmeyecek ve sonraki iterasyonlarda daha küçük bir sayı ile karşılaşıldıkça bu sayı minValue
            //değişkenine, daha büyük sayı ile karşılaşıldıkça da maxValue değişkenine atanacak. Döngü tamamlandığında
            //maxValue ve minValue değerleri, girilen sayılar içindeki en büyük ve en küçük değerlere sahip olacaklar.

            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        //max ve min değerlerini ekrana yazdırıyoruz.
        System.out.println("Max değer: " + maxValue + " - Min değer: " + minValue);

    }
}
