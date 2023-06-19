import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class addTest {
    @Test
    public void testAddNumbers() {
        int result = add.addNumbers(2, 3);
        assertEquals(5, result);
    }
}
