package ua.lviv.iot.Athletes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunTest {

	Run athlete;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		athlete = new Run(40, 4.5, 299.9);
	}

	@Test
	void testGetDistanceInM() {
		Assertions.assertEquals(299.9, athlete.getDistanceInM());
	}

	@Test
	void testSetDistanceInM() {
		athlete.setDistanceInM(199.9);
		Assertions.assertEquals(199.9, athlete.getDistanceInM());
	}

	@Test
	void testToString() {
		Assertions.assertEquals("Run on 299.9 with the time for a round:4.5 and an avarage number of purticipants: 40",
				athlete.toString());
	}

}
