package ua.lviv.iot.Athletes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThrowsTest {

	Throws athlete;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		athlete = new Throws(40, 4.5, 25.5);
	}

	@Test
	void testToString() {
		String expected = "Throws of 25.5 kilograms, with the time for a round:4.5 and an avarage number of purticipants:40";
		Assertions.assertEquals(expected, athlete.toString());
	}

	@Test
	void testGetWeightInKg() {
		Assertions.assertEquals(25.5, athlete.getWeightInKg());
	}

	@Test
	void testSetWeightInKg() {
		athlete.setWeightInKg(23.5);
		Assertions.assertEquals(23.5, athlete.getWeightInKg());
	}
}
