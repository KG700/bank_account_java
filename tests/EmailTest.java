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
}