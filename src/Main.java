import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        int result = calculator.add(4, 6);
        assertThat(result, is(10));
    }
}