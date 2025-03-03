package hafta1;

import java.util.Scanner;

public class Average3_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int num = scanner.nextInt();

        int sum = 0;
        int counter = 0;
        int i = 1;
        while (i<=num){
            if(i%3 == 0 && i%4 == 0){
                sum += i;
                counter++;
            }
            i++;
        }
        System.out.println(num + "'ye kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması = " + (sum/counter) + "'dır");
    }
}
