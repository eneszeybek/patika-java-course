package Week5.Lambdas;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Lambda ve Stream kullanarak sayıları iki katına çıkarma ve yazdırma
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}