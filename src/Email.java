public class Email {

    String firstName;
    String lastName;

    Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String generate() {
        return firstName + "." + lastName + "@department.company.com";
    }

}
