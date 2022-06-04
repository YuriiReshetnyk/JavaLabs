package ua.lviv.iot.Athletes;

public class Throws extends Athletes {

	private double weightInKg;

	public double getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}

	public Throws(int avarageNumberOfParticipant, double timeOfRoundInMinutes, double weightInKg) {
		super(AthleteType.THROWS, avarageNumberOfParticipant, timeOfRoundInMinutes);
		this.weightInKg = weightInKg;
	}

	@Override
	public String toString() {
		return "Throws of " + weightInKg + " kilograms, with the time for a round:" + getTimeOfRoundInMinutes()
				+ " and an avarage number of purticipants:" + getAvarageNumberOfParticipant();
	}
}