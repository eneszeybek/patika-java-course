package Week1;

import java.util.Scanner;

/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
*/

public class PerfectNumber {
    public static void main(String[] args) {

        //Koda kullanıcıdan input isteneceğini bildiriyoruz.
        Scanner scanner = new Scanner(System.in);

        //Kullanıcının girdiği değeri num değişkenimize atıyoruz.
        System.out.println("Bir sayı giriniz:");
        int num = scanner.nextInt();

        //Toplam tutmak için sum değişkeni tanımlıyoruz.
        int sum = 0;

        //num sayısının tüm bölenlerini bulmak için 1'den sayının yarısına kadar olan sayılara bakacağız.
        //(koşula i<num da yazılabilir ancak sayı zaten yarısından büyük bir sayıya bölünemez, döngüyü kısa tutmuş olacağız)
        for (int i=1;i<(num/2+1);i++){

            //num sayısının i'nin mevcut değerine bölünüp bölünmediğini kontrol ediyoruz.
            if(num%i == 0){

                //num sayısı i'ye tam bölünüyorsa sum değerimizi sum+i olarak güncelliyoruz.
                sum += i;
            }
        }

        //num sayısı, bölenlerinin toplamına eşit ise ekrana mükemmel sayı olduğunu, eşit değil ise olmadığını yazdırıyoruz.
        if(sum == num){
            System.out.println(num + " mükemmel sayıdır");
        }else {
            System.out.println(num + " mükemmel sayı değildir");
        }
    }
}
