package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FindTheLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Orijinal ve güncellenmiş listeleri oluşturma
        List<String> letterList = new ArrayList<>();
        List<String> updatedList = new ArrayList<>();
        int listCapacity = 4;

        //Listeyi rastgele küçük harflerle doldurma
        for(int i=0; i<listCapacity; i++){
            char character = (char) ('a' + random.nextInt(26));
            if(letterList.contains(String.valueOf(character))){
                i--;
                continue;
            }
            letterList.add(String.valueOf(character));
            updatedList.add(String.valueOf(character));

        }

        //Kullanıcıdan harf girişi alma ve listeyi güncelleme
        System.out.println("Lütfen " + listCapacity + " farklı küçük harf giriniz.");
        for (int i=0; i<listCapacity; i++) {
            String letterEntry = scanner.next();
            if(letterEntry.length() != 1 || !Character.isLowerCase(letterEntry.charAt(0))){
                System.out.println("Lütfen tek küçük harf giriniz");
                i--;
                continue;
            }
            if(letterList.contains(letterEntry)){
                int index = letterList.indexOf(letterEntry);
                updatedList.set(index, "found");
            }
        }
        //Listeleri ekrana yazdırma
        System.out.println("Orijinal Liste     :" + letterList);
        System.out.println("Güncellenmiş Liste :" + updatedList);
    }
}
