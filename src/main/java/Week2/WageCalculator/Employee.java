package Week2.WageCalculator;

public class Employee  {

    //Constructor method parametreleri
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    //Constructor method tanımlama
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Vergi hesaplama metodu
    public double tax(){
        if(salary<1000){
            return 0;
        }
        else{
            return salary*0.03;
        }
    }
    //Ekstra ücret hesaplama metodu
    public int bonus(){
        if(workHours>40){
            return 30*(workHours-40);
        }
        else{
            return 0;
        }
    }

    //Maaş artışı hesaplama metodu
    public double raiseSalary(){
        double raise = 0;
        if(2025-hireYear < 10){
            raise = 0.05;
        } else if (2025-hireYear<20) {
            raise = 0.1;
        }
        else {
            raise = 0.15;
        }
        return salary*raise;
    }

    //Ekrana yazdırmak için toString metodu
    public String toString(){
        double taxAmount = tax();
        int bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double salaryWithTaxAndBonus = salary-tax()+bonus();
        double totalSalary = salary-tax()+bonus()+raiseSalary();

        return  "Adı: " + name + '\n' +
                "Maaşı: " + salary + '\n' +
                "Çalışma Saati: " + workHours + '\n' +
                "Başlangıç Yılı: " + hireYear + '\n' +
                "Vergi: " + taxAmount + '\n' +
                "Bonus: " + bonusAmount + '\n' +
                "Maaş Artışı: " + raiseAmount + '\n' +
                "Vergi ve bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus + '\n' +
                "Toplam Maaş: " + totalSalary;
}
}
