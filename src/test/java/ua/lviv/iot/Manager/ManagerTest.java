package ua.lviv.iot.Manager;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.Athletes.AthleteType;
import ua.lviv.iot.Athletes.Athletes;
import ua.lviv.iot.Athletes.Jumps;
import ua.lviv.iot.Athletes.Run;
import ua.lviv.iot.Athletes.Throws;

class ManagerTest {

	Manager manager;
	
	@BeforeEach
	void setUpBeforeClass() throws Exception {
		manager = new Manager();
		manager.addAthlete(new Athletes(AthleteType.NULL, 100, 20.5));
		manager.addAthlete(new Run(36, 5.6, 500.5));
		manager.addAthlete(new Jumps(37, 5.7, 5));
		manager.addAthlete(new Throws(40, 4.5, 25.5));
	}
	
	@Test
	void testAddAthlete() {
		
		var newAthlete = new Run(6, 25.6, 999.9);
		manager.addAthlete(newAthlete);
		Assertions.assertEquals(5, manager.athletes.size());
		Assertions.assertEquals(newAthlete, manager.athletes.get(manager.athletes.size() - 1));
	}
	
	@Test
	void testFindAthleteWithFinish() {
		
		var athleteWithFinish = manager.findAthleteWithFinish();
		Assertions.assertFalse(manager.athletes.isEmpty());
		athleteWithFinish.forEach(athlete -> {Assertions.assertTrue(athlete instanceof Run);});
	}
	
	@Test
	void testSortByMaxNumberOfParticipantDecrease() {
		testSortByMaxNumberOfParticipantByOrder(false);
	}
	
	@Test
	void testSortByMaxNumberOfParticipantGrowth() {
		testSortByMaxNumberOfParticipantByOrder(true);
	}
	
	void testSortByMaxNumberOfParticipantByOrder(boolean order) {
		manager = new Manager();
		Athletes athlete1 = new Athletes(AthleteType.NULL, 100, 20.5);
		Run athlete2 = new Run(36, 5.6, 500.5);
		Jumps athlete3 = new Jumps(37, 5.7, 5);
		Throws athlete4 = new Throws(40, 4.5, 25.5);
		manager.addAthlete(athlete1);
		manager.addAthlete(athlete2);
		manager.addAthlete(athlete3);
		manager.addAthlete(athlete4);
		var expectedResult = Arrays.asList(athlete1, athlete4, athlete3, athlete2);
		if(!order)
			Collections.reverse(expectedResult);
		
		var sortedByMaxNumberOfParticipant = manager.sortByMaxNumberOfParticipant(order);
		Assertions.assertFalse(sortedByMaxNumberOfParticipant.isEmpty());
		Assertions.assertEquals(sortedByMaxNumberOfParticipant.size(), expectedResult.size());
		
		for (int i = 0; i < 4; i++) {
			Assertions.assertEquals(expectedResult.get(i), sortedByMaxNumberOfParticipant.get(i));
		}
		
	}
	
	@Test
	void testSortByAverageTimeOfRoundDecrease() {
		testSortByAverageTimeOfRoundByOrder(false);
	}
	
	@Test
	void testSortByAverageTimeOfRoundGrowth() {
		testSortByAverageTimeOfRoundByOrder(true);
	}
	
	void testSortByAverageTimeOfRoundByOrder(boolean order) {
		manager = new Manager();
		Athletes athlete1 = new Athletes(AthleteType.NULL, 100, 20.5);
		Run athlete2 = new Run(36, 5.6, 500.5);
		Jumps athlete3 = new Jumps(37, 5.7, 5);
		Throws athlete4 = new Throws(40, 4.5, 25.5);
		manager.addAthlete(athlete1);
		manager.addAthlete(athlete2);
		manager.addAthlete(athlete3);
		manager.addAthlete(athlete4);
		var expectedResult = Arrays.asList(athlete1, athlete3, athlete2, athlete4);
		if(!order)
			Collections.reverse(expectedResult);
		
		var sortedByAverageTimeOfRound = manager.sortByAverageTimeOfRound(order);
		Assertions.assertFalse(sortedByAverageTimeOfRound.isEmpty());
		Assertions.assertEquals(sortedByAverageTimeOfRound.size(), expectedResult.size());
		
		for (int i = 0; i < 4; i++) {
			Assertions.assertEquals(expectedResult.get(i), sortedByAverageTimeOfRound.get(i));
		}
		
	}

}
