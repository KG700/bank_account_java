import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    public void getFirstName() throws Exception {
        Email em1 = new Email("Amy", "Johnson");
        assertEquals("Amy", em1.getFirstName());
    }

    @Test
    public void getSalesDepartmentFromUser() {
        Email em1 = new Email("Amy", "Johnson");
        String userInput = "1";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("sales", em1.setDepartment());
    }

    @Test
    public void getDevelopmentDepartmentFromUser() {
        Email em1 = new Email("Amy", "Johnson");
        String userInput = "2";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("development", em1.setDepartment());
    }

    @Test
    public void getAccountingDepartmentFromUser() {
        Email em1 = new Email("Amy", "Johnson");
        String userInput = "3";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("accounting", em1.setDepartment());
    }

    @Test
    public void getNoDepartmentFromUser() {
        Email em1 = new Email("Amy", "Johnson");
        String userInput = "0";
        InputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        assertEquals("", em1.setDepartment());
    }
}