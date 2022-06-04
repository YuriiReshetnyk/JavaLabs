package ua.lviv.iot.Manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.Athletes.*;

public class Manager {

	List<Athletes> athletes = new ArrayList<Athletes>();

	public void addAthlete(Athletes athlete) {
		athletes.add(athlete);
	}

	public void printAthletes() {
		for (Athletes athlete : athletes) {
			System.out.println(athlete);
		}
	}

	public List<Athletes> findAthleteWithFinish() {

		List<Athletes> athletesWithFinish = new ArrayList<Athletes>();

		for (Athletes athlete : athletes) {
			if (athlete.getAthleteType() == AthleteType.RUN) {
				athletesWithFinish.add(athlete);
			}
		}
		return athletesWithFinish;
	}

	public List<Athletes> sortByMaxNumberOfParticipant(boolean reverse) {

		List<Athletes> sortedListOfSports = athletes.stream()
				.sorted(Comparator.comparing(Athletes::getAvarageNumberOfParticipant))
				.collect(Collectors.toCollection(ArrayList::new));
		if (reverse)
			Collections.reverse(sortedListOfSports);
		return sortedListOfSports;
	}

	public List<Athletes> sortByAverageTimeOfRound(boolean reverse) {

		List<Athletes> sortedListOfSports = athletes.stream()
				.sorted(Comparator.comparing(Athletes::getTimeOfRoundInMinutes))
				.collect(Collectors.toCollection(ArrayList::new));
		if (reverse)
			Collections.reverse(sortedListOfSports);
		return sortedListOfSports;
	}
}