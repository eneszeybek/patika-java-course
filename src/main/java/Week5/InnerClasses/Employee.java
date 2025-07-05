package Week5.InnerClasses;

public class Employee {
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo;

    // Constructor
    public Employee(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phone, email);
    }

    // Inner Class
    public class ContactInfo {
        private String phoneNumber;
        private String emailAddress;

        // Constructor
        public ContactInfo(String phoneNumber, String emailAddress) {
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        // İletişim bilgilerini gösteren metot
        public void displayContactInfo() {
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + emailAddress);
        }
    }

    // Çalışan bilgilerini ve iletişim bilgilerini gösteren metot
    public void displayEmployeeInfo() {
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        contactInfo.displayContactInfo();
    }

    // Main metodu: Test için örnek kullanım
    public static void main(String[] args) {
        Employee emp = new Employee("Ayşe", "Yılmaz", "0555-123-4567", "ayse.yilmaz@example.com");
        emp.displayEmployeeInfo();
    }
}