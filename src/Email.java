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
