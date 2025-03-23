package Week3;

import java.util.HashMap;
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
            Integer counter = 1;

            if(letterRepetition.containsKey(letter)){
                letterRepetition.replace(letter, letterRepetition.get(letter) + 1);
            }
            else{
                letterRepetition.put(letter, counter);
            }
        }
        System.out.println(letterRepetition);
    }
}
