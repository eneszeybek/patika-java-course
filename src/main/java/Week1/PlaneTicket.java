package Week1;

import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan mesafe bilgisini alma
        System.out.println("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();

        //Kullaıcıdan yaş bilgisini alma
        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        //Kullanıcıdan yolculuk tipini alma
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int type = scanner.nextInt();

        //Herhangi bir indirim uygulanmamış, tek yön fiyatı
        double totalCost = distance * 0.1;

        //yaş indirimi uygulanması
        if(age<12){
            totalCost = 0.5 * totalCost;
        }
        else if(age<24){
            totalCost = 0.9 * totalCost;
        }
        else if(age>65){
            totalCost = 0.7 * totalCost;
        }

        //Gidiş-dönüş ise fiyat hesaplanması
        if (type==2){
            totalCost = 2 * 0.8 * totalCost;
        }

        //Geçerli değer girdisi kontolü
        if(distance <= 0 || age < 0 || (type != 1 && type != 2)){
            System.out.println("Hatalı veri girdiniz");
        }
        else {
           //Fiyatın ekrana yazdırılması
           System.out.println("Toplam Tutar: " + totalCost);
        }
    }
}
