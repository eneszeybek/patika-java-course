package Week1;

import java.util.Scanner;

/*Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada k*n’lik bir matrisin
transpozu (devriği) n*k’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği),
A^T (A üzeri T) ile gösterilir.*/

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //row*column boyutlarında bir matris oluşturmak için kullanıcıdan satır ve sütun sayılarını input olarak
        //alıp, bu değerleri sırasıyla row ve column değişkenlerimize atıyoruz.

        System.out.print("Matris satır sayısını giriniz: ");
        int row = scanner.nextInt();

        System.out.print("Matris sütun sayısını giriniz: ");
        int column = scanner.nextInt();

        //row*column boyutunda bir matris tanımlıyoruz.

        int[][] matrix = new int[row][column];

        //kullanıcıdan matrisin değerlerini sırasıyla her satır için input olarak alıyoruz.
        //dış döngüdeki i değeri satır indeximizi, iç döngüdeki j değeri ise sütun indeksimizi temsil ediyor.

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + 1 + ". satırdaki sayıları giriniz: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //matrix matrisi row*column boyutunda ise transpozu column*row boyutunda olacak
        //bu şekilde transpose matrisini tanımlıyoruz

        int[][] transpose = new int[column][row];

        //transpose matrisinin satırları, matrix matrisinin sütunlarından oluşacak.
        //yine dıştaki for'da transpose matrisinin satır sayısı kadar ve içteki for'da sütun sayısı kadar
        //döngü ile matrix'teki değerleri çapraz olarak transpose'a atıyoruz.

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        //son aşamada anlaşılır bir karşılaştırma yapabilmek için matrix matrisini ekrana yazdırıyoruz.
        System.out.println("Matris:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " "); //satırdaki değerler arasında boşluk gözüksün istiyoruz
            }
            System.out.println(); //önceki satır yazdırıldıktan sonra alt satıra geçmek istiyoruz.
        }

        //transpose matrisini ekrana anlaşılır şekilde yazdırıyoruz.
        System.out.println("Transpoz");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
