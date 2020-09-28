public class EmailApplication {
    public static void main(String[] args) {
        Email em1 = new Email("Karla", "Gardiner");
        String department = em1.setDepartment();
        System.out.println("Department set to: " + department);
    }
}
