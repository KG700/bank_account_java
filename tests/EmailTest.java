import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    private Email amyEmail;

    @BeforeEach
    void myTestSetUp() {
        String userInput = "0";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        amyEmail = new Email("Amy", "Johnson");
    }

    @Test
    public void getFirstName() throws Exception {
        assertEquals("Amy", amyEmail.getFirstName());
    }

    @Test
    public void getSalesDepartmentFromUser() {
        String userInput = "1";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("sales", amyEmail.setDepartment());
    }

    @Test
    public void getDevelopmentDepartmentFromUser() {
        String userInput = "2";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("development", amyEmail.setDepartment());
    }

    @Test
    public void getAccountingDepartmentFromUser() {
        String userInput = "3";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("accounting", amyEmail.setDepartment());
    }

    @Test
    public void getNoDepartmentFromUser() {
        String userInput = "0";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("", amyEmail.setDepartment());
    }

    @Test
    public void getSalesEmail() {
        String userInput = "1";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        amyEmail = new Email("Amy", "Johnson");

        assertEquals("amy.johnson@sales.company.com", amyEmail.getEmail());
    }

    @Test
    public void getNoDepartmentEmail() {
        String userInput = "1";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("amy.johnson@company.com", amyEmail.getEmail());
    }

    @Test
    public void randomPasswordIsCorrectLength() {
        assertEquals(10, amyEmail.getPassword().length());
    }

    @Test
    public void mailBoxCapacityDefaultIs500() {
        assertEquals(500, amyEmail.getMailBoxCapacity());
    }

    @Test
    public void mailBoxCapacityCanBeSetTo1000() {
        amyEmail.setMailBoxCapacity(1000);
        assertEquals(1000, amyEmail.getMailBoxCapacity());
    }

    @Test
    public void alternativeEmailDefaultsToBeNull() {
        assertEquals(null, amyEmail.getAlternativeEmail());
    }

    @Test
    public void alternativeEmailCanBeSet() {
        amyEmail.setAlternativeEmail("aj@example.com");
        assertEquals("aj@example.com", amyEmail.getAlternativeEmail());
    }

    @Test
    public void canChangePassword() {
        amyEmail.changePassword("aNewPassword");
        assertEquals("aNewPassword", amyEmail.getPassword());
    }
}