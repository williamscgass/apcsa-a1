import org.junit.Test;

public class TestCalculator extends Autograder {
    @Test
    public void testAdd() {
        test("testAdd", (params) -> {
            Calculator calculator = new Calculator();
            return calculator.multiply((int) params[0], (int) params[1]);
        }, new Object[]{3, 4}, 12, 10); // Assuming 10 points for this test
    }
}
