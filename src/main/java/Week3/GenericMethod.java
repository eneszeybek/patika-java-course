package Week3;

public class GenericMethod {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Elma", "Armut", "Muz"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.println("Integer Dizisi:");
        printArray(intArray);

        System.out.println("\nString Dizisi:");
        printArray(stringArray);

        System.out.println("\nDouble Dizisi:");
        printArray(doubleArray);
    }
}
