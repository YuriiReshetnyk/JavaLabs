package ua.lviv.iot;

import ua.lviv.iot.Athletes.*;
import ua.lviv.iot.Manager.*;

public class Main {

	public static void main(String[] args) {

		final String SPLITTER = "________________________________________________________________________________";

		Athletes athlete1 = new Athletes(20.5f, 100, AthleteType.NULL);
		Run athlete2 = new Run(5.6f, 36, 500.5f);
		Jumps athlete3 = new Jumps(5.7f, 35, 5);
		Throws athlete4 = new Throws(4.5f, 40, 25.5f);

		Manager manager = new Manager();
		manager.addSport(athlete1);
		manager.addSport(athlete2);
		manager.addSport(athlete3);
		manager.addSport(athlete4);

		manager.printSports();
		System.out.println(SPLITTER);
		manager.sortByMaxNumberOfParticipant(false).forEach(System.out::println);
		;
		System.out.println(SPLITTER);
		manager.sortByAverageTimeOfRound(false).forEach(System.out::println);
		;
		System.out.println(SPLITTER);
		manager.findSportWithFinish().forEach(System.out::println);
	}
}