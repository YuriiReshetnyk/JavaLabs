package Regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CarNumberChangerTest {

	@Test
	void testChangeCarNumbers() {
		CarNumberChanger carNumberChanger = new CarNumberChanger();
		String text = "dfgdBC 4124 AAgdfg AA4124FF gdfgfd	333-33 AA";
		String expectedText = "dfgdCAR_NUMBERgdfg CAR_NUMBER gdfgfd	CAR_NUMBER";
		Assertions.assertEquals(expectedText, carNumberChanger.changeCarNumbers(text));
	}

}
