package Week1;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int num = scanner.nextInt();
        int i, j;

        for (i=num ; i>0 ; i--){
            for (j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
