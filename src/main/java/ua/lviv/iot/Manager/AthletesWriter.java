package ua.lviv.iot.Manager;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.Athletes.AthleteType;
import ua.lviv.iot.Athletes.Athletes;

public class AthletesWriter {

	public static void writeToFile(List<Athletes> athletes) throws IOException {
		if (!athletes.isEmpty()) {
			try (FileWriter writer = new FileWriter("result.csv")) {
				athletes.sort(Comparator.comparing(Athletes::getAthleteType));

				var previousType = AthleteType.NULL;

				for (var athlete : athletes) {
					if (!athlete.getAthleteType().equals(previousType)) {
						writer.write(athlete.getHeaders());
						writer.write("\r\n");
						previousType = athlete.getAthleteType();
					}
					writer.write(athlete.toCSV());
					writer.write("\r\n");
				}
				writer.flush();
			}
		}
	}
}