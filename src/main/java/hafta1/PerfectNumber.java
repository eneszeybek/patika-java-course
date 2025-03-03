package hafta1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int num = scanner.nextInt();
        int i;
        int sum = 0;

        for (i=1;i<(num/2+1);i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println(num + " mükemmel sayıdır");
        }else {
            System.out.println(num + " mükemmel sayı değildir");
        }
    }
}
