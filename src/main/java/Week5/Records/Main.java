package Week5.Records;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ayşe", "Yılmaz", "2023001");
        Student student2 = new Student("Mehmet", "Demir", "2023002");
        Student student3 = new Student("Ayşe", "Yılmaz", "2023001"); // Aynı verilerle

        System.out.println("Öğrenci 1: " + student1);
        System.out.println("Öğrenci 2: " + student2);
        System.out.println("Öğrenci 3: " + student3);

        // equals() ve hashCode() kontrolü
        System.out.println("\nstudent1 equals student3? " + student1.equals(student3));
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
    }
}
