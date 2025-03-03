package Practice1;

public class SwitchCase3 {
    public static void main(String[] args) {

        int grade = 69;

        String letterGrade = switch (grade/10){
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6 -> "C";
            case 4, 5 -> "D";
            default -> "F";
        };

        System.out.println(letterGrade);
    }
}
