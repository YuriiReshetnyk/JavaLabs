package ua.lviv.iot;

import ua.lviv.iot.Athletes.*;
import ua.lviv.iot.Manager.Manager;

public class Main {

	public static void main(String[] args) {

		final String SPLITTER = "________________________________________________________________________________";

		Athletes athlete1 = new Athletes(AthleteType.NULL, 100, 20.5);
		Run athlete2 = new Run(36, 5.6, 500.5);
		Jumps athlete3 = new Jumps(37, 5.7, 5);
		Throws athlete4 = new Throws(40, 4.5, 25.5);

		Manager manager = new Manager();
		manager.addAthlete(athlete1);
		manager.addAthlete(athlete2);
		manager.addAthlete(athlete3);
		manager.addAthlete(athlete4);

		manager.printAthletes();
		System.out.println(SPLITTER);
		manager.sortByMaxNumberOfParticipant(false).forEach(System.out::println);
		;
		System.out.println(SPLITTER);
		manager.sortByAverageTimeOfRound(false).forEach(System.out::println);
		;
		System.out.println(SPLITTER);
		manager.findAthleteWithFinish().forEach(System.out::println);
	}
}