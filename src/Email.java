public class Email {

    String firstName;
    String lastName;
    String department;
    String emailAddress;
    String password;
    String alternativeEmail;
    int mailCapacity;

    Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    void generateEmail() {
        emailAddress = firstName + "." + lastName + "@" + department + ".company.com";
    }

    void generatePassword() {
        password = "ABC";
    }

    void changePassword(String newPassword) {
        password = newPassword;
    }

    void setMailCapacity(int capacity) {
        mailCapacity = capacity;
    }

    String getName() {
        return firstName + " " + lastName;
    }

    String getEmail() {
        return emailAddress;
    }

    int getMailCapacity() {
        return mailCapacity;
    }


}
