package Week3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class LetterRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz: ");
        String input = scanner.nextLine();
        String word = input.toLowerCase().replaceAll(("[^a-zA-Z]"), "");

        System.out.println(word);

        Map<Character, Integer> letterRepetition = new HashMap<>();

        for (int i=0; i<word.length(); i++){
            Character letter = word.charAt(i);

            if(letterRepetition.containsKey(letter)){
                letterRepetition.replace(letter, letterRepetition.get(letter) + 1);
            }
            else{
                letterRepetition.put(letter, 1);
            }
        }

        Iterator<Character> iterator = letterRepetition.keySet().iterator();

        while (iterator.hasNext()){
            Character c = iterator.next();
            Integer i = letterRepetition.get(c);
            System.out.println(c + " = " + i);
        }
    }
}
