package Practice1;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double no1 = scanner.nextDouble();
        char operation = scanner.next().charAt(0);
        double no2 = scanner.nextDouble();

        switch (operation){
            case '+':
                System.out.println("= " + (no1+no2));
                break;
            case '-':
                System.out.println("= " + (no1-no2));
                break;
            case '*':
                System.out.println("= " + (no1*no2));
                break;
            case '/':
                if (no2 != 0){
                    System.out.println(" = " + (no1/no2));
                    break;
                } else {
                    System.out.println("Bölen 0 olamaz");
                    break;
                }

            default:
                System.out.println("geçersiz");
        }
    }
}
