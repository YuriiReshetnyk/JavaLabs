package ua.lviv.iot.Athletes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AthletesTest {

	Athletes athlete;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		athlete = new Athletes(AthleteType.NULL, 40, 4.5);
	}

	@Test
	void testGetAthleteType() {
		Assertions.assertEquals(AthleteType.NULL, athlete.getAthleteType());
	}

	@Test
	void testSetAthleteType() {
		athlete.setAthleteType(AthleteType.JUMPS);
		Assertions.assertEquals(AthleteType.JUMPS, athlete.getAthleteType());
	}

	@Test
	void testGetAvarageNumberOfParticipant() {
		Assertions.assertEquals(40, athlete.getAvarageNumberOfParticipant());
	}

	@Test
	void testSetAvarageNumberOfParticipant() {
		athlete.setAvarageNumberOfParticipant(23);
		Assertions.assertEquals(23, athlete.getAvarageNumberOfParticipant());
	}

	@Test
	void testGetTimeOfRoundInMinutes() {
		Assertions.assertEquals(4.5, athlete.getTimeOfRoundInMinutes());
	}

	@Test
	void testSetTimeOfRoundInMinutes() {
		athlete.setTimeOfRoundInMinutes(23.5);
		Assertions.assertEquals(23.5, athlete.getTimeOfRoundInMinutes());
	}

	@Test
	void testToString() {
		Assertions.assertEquals("Sport with time of a round: 4.5 and an avarage number of purticipants: 40",
				athlete.toString());
	}

}
