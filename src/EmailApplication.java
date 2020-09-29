public class EmailApplication {
    public static void main(String[] args) {
        Email emailAccount = new Email("Test", "Person");
        System.out.println(emailAccount.getInfo());
    }
}
