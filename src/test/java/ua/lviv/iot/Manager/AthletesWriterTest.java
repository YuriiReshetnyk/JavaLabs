package ua.lviv.iot.Manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.Athletes.Jumps;
import ua.lviv.iot.Athletes.Run;
import ua.lviv.iot.Athletes.Throws;

class AthletesWriterTest {

	final String pathOfActualFile = "D:\\JavaProjectsEclipse\\laba4\\result.csv";
	final String pathOfExpectedFile = "D:\\JavaProjectsEclipse\\laba4\\src\\test\\resources\\expected.csv";

	@BeforeEach
	void setUp() throws Exception {
		Run athlete2 = new Run(36, 5.6, 500.5);
		Jumps athlete3 = new Jumps(37, 5.7, 5);
		Throws athlete4 = new Throws(40, 4.5, 25.5);

		Manager manager = new Manager();
		manager.addAthlete(athlete2);
		manager.addAthlete(athlete3);
		manager.addAthlete(athlete4);
	}

	@Test
	void testWriteToFile() throws IOException {
		try (FileReader expectedReader = new FileReader(String.valueOf(pathOfExpectedFile));
				BufferedReader expectedBR = new BufferedReader(expectedReader);
				FileReader actualReader = new FileReader(String.valueOf(pathOfActualFile));
				BufferedReader actualBR = new BufferedReader(actualReader)) {

			var actualLine = actualBR.readLine();
			var expectedLine = expectedBR.readLine();
			while (actualLine != null || expectedLine != null) {
				Assertions.assertEquals(expectedLine, actualLine);
				actualLine = actualBR.readLine();
				expectedLine = expectedBR.readLine();
			}
		}
	}

}
