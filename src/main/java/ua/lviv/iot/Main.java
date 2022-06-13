package ua.lviv.iot;

import java.util.Scanner;

import Regex.CarNumberChanger;

public class Main {

	public static void main(String[] args) {
		CarNumberChanger carNumberChanger = new CarNumberChanger();
		try (Scanner scanner = new Scanner(System.in)) {
			String text = scanner.nextLine();
			System.out.println(carNumberChanger.changeCarNumbers(text));
		}
	}
}