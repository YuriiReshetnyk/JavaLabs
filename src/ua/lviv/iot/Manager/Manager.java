package ua.lviv.iot.Manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.Athletes.*;

public class Manager {

	List<Athletes> sports = new ArrayList<Athletes>();

	public void addSport(Athletes sport) {
		sports.add(sport);
	}

	public void printSports() {
		for (Athletes sport : sports) {
			System.out.println(sport);
		}
	}

	public List<Athletes> findSportWithFinish() {

		List<Athletes> sportsWithFinish = new ArrayList<Athletes>();

		for (Athletes sport : sports) {
			if (sport.getAthleteType() == AthleteType.RUN) {
				sportsWithFinish.add(sport);
			}
		}
		return sportsWithFinish;
	}

	public List<Athletes> sortByMaxNumberOfParticipant(boolean reverse) {

		List<Athletes> sortedListOfSports = sports.stream()
				.sorted(Comparator.comparing(Athletes::getNumberOfParticipant))
				.collect(Collectors.toCollection(ArrayList::new));
		if (reverse)
			Collections.reverse(sortedListOfSports);
		return sortedListOfSports;
	}

	public List<Athletes> sortByAverageTimeOfRound(boolean reverse) {

		List<Athletes> sortedListOfSports = sports.stream()
				.sorted(Comparator.comparing(Athletes::getTimeOfRoundInMinutes))
				.collect(Collectors.toCollection(ArrayList::new));
		if (reverse)
			Collections.reverse(sortedListOfSports);
		return sortedListOfSports;
	}
}
