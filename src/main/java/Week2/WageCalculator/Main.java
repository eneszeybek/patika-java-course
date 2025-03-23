package Week2.WageCalculator;

public class Main {
    public static void main(String[] args) {

        //Constructor metod sınıfında nesne oluşturma
        Employee employee1 = new Employee("Kemal", 2000, 45, 1985);

        //Çalışan bilgilerini ekrana yazdırma
        System.out.println(employee1.toString());
    }
}
