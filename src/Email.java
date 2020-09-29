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
        System.out.println(this.department);

        this.password = generateRandomPassword(10);
        System.out.println(password);
    }

    String getFirstName() {
        return this.firstName;
    }

    String getPassword() {
        return this.password;
    }

    String setDepartment() {
        System.out.println("DEPARTMENT CODES\n\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none of the above\n\nEnter your department code:");
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
    String generateRandomPassword(int length) {
        String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%!";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordCharacters.length());
            password[i] = passwordCharacters.charAt(rand);
        }
        return new String(password);
    }
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
