package ua.lviv.iot.Athletes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JumpsTest {

	Jumps athlete;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		athlete = new Jumps(40, 4.5, 2);
	}

	@Test
	void testGetNumberOfTry() {
		Assertions.assertEquals(2, athlete.getNumberOfTry());
	}

	@Test
	void testSetNumberOfTry() {
		athlete.setNumberOfTry(3);
		Assertions.assertEquals(3, athlete.getNumberOfTry());
	}

	@Test
	void testToString() {
		Assertions.assertEquals(
				"Jumps with 2 number of tries, with the time for a round:4.5 and an avarage number of purticipants: 40",
				athlete.toString());
	}

}
