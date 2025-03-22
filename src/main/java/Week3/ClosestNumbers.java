package Week3;

import java.util.ArrayList;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {

        //Liste oluşturma
        List<Integer> numbersList = new ArrayList<>();

        //Listeye 10 adet 0-100 arasında tekrar etmeyen sayı doldurma
        for (int i = 0; i < 10; i++) {
            int j = (int) (Math.random() * 99) + 1;
            if(numbersList.contains(j)){
                i--;
            }
            else numbersList.add(j);
        }

        //Listeyi ekrana yazdırma
        System.out.println("Oluşturulan 10 Sayılık Liste:\n" + numbersList);

        //En küçük farkı bulup bu sayıların indexini tutma
        int minDifference = Math.abs(numbersList.get(0) - numbersList.get(1));
        int indexNumber1 = 0, indexNumber2 = 1, difference;
        for (int i = 0; i < numbersList.size() - 1; i++) {
            for (int j = i+1; j < numbersList.size(); j++) {
                difference = Math.abs(numbersList.get(i) - numbersList.get(j));
                if(difference < minDifference){
                    minDifference = difference;
                    indexNumber1 = i;
                    indexNumber2 = j;
                    }
            }
        }
        //En yakın sayıları ekrana yazdırma
        System.out.println(("En yakın 2 sayı:\n") + numbersList.get(indexNumber1) + " ve " + numbersList.get(indexNumber2));

    }
}
