import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String emailAddress;
    private String password;
    private String alternativeEmail;
    private int mailCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
    }

    String getFirstName() {
        return this.firstName;
    }

    String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none of the above");
        Scanner scanner = new Scanner(System.in);
        String depChoice = scanner.next();
        switch(depChoice) {
            case "1":
                return "sales";
            case "2":
                return "development";
            case "3":
                return "accounting";
            default:
                return "";

        }
    }

//    void generateEmail() {
//        emailAddress = firstName + "." + lastName + "@" + department + ".company.com";
//    }
//
//    void generatePassword() {
//        password = "ABC";
//    }
//
//    void changePassword(String newPassword) {
//        password = newPassword;
//    }
//
//    void setMailCapacity(int capacity) {
//        mailCapacity = capacity;
//    }
//
//    void setAlternativeEmail(String altEmail) {
//        alternativeEmail = altEmail;
//    }
//
//    String getName() {
//        return firstName + " " + lastName;
//    }
//
//    String getEmail() {
//        return emailAddress;
//    }
//
//    int getMailCapacity() {
//        return mailCapacity;
//    }


}
