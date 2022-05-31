package ua.lviv.iot;

import ua.lviv.iot.Athletes.*;

public class Main {

	public static void main(String[] args) {
		Athletes athlete1 = new Athletes(20.5f, 100);
		System.out.println(athlete1);
		System.out.println("____________________________________________________________________________");
		Run athlete2 = new Run(5.5f, 30, 500.5f);
		System.out.println(athlete2);
		System.out.println("____________________________________________________________________________");
		Jumps athlete3 = new Jumps(5.5f, 30, 5);
		System.out.println(athlete3);
		System.out.println("____________________________________________________________________________");
		Throws athlete4 = new Throws(5.5f, 30, 25.5f);
		System.out.println(athlete4);
		System.out.println("____________________________________________________________________________");
	}

}
