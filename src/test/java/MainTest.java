import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
	

	@Test
	void testHypotenuse() {
		double first_val = 3.0;
		double second_val = 2.0;

		double num = Math.sqrt((first_val * first_val) + (second_val * second_val));
		double test_num = Main.hypotenuse(first_val, second_val);
		assertEquals(num, test_num);
	}

}
