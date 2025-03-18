package Week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepetitionComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle yazınız: ");
        String sentence = scanner.nextLine();
        String[] wordsToShow = sentence.split("\\s+");
        String[] words = sentence.toLowerCase().split("\\s+");
        int[] counter = new int[words.length];
        Set<Character> countedLetter = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            counter[i] = 0;
            countedLetter.clear();
            for (int j = 0; j < words[i].length() - 1; j++) {
                char letter = words[i].charAt(j);
                for (int k = j + 1; k < words[i].length(); k++) {
                    if (letter == words[i].charAt(k)) {
                        if(!countedLetter.contains(letter)){
                            counter[i]++;
                        }
                        countedLetter.add(letter);
                        counter[i]++;
                        break;
                    }
                }
            }
        }
        int resultIndex = -1, max = 0;
        for (int i = 0; i < words.length; i++) {
            if(counter[i]>max){
                max = counter[i];
                resultIndex = i;
            }
        }
        if(resultIndex >= 0){
            System.out.println(wordsToShow[resultIndex]);
        }
        else{
            System.out.println(resultIndex);
        }
    }
}
