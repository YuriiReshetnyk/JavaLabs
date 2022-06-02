package ua.lviv.iot.Athletes;

public class Jumps extends Athletes {

	private int numberOfTry;

	public int getNumberOfTry() {
		return numberOfTry;
	}

	public Jumps(float timeOfRoundInMinutes, int numberOfParticipant, int numberOfTry) {
		super(timeOfRoundInMinutes, numberOfParticipant, AthleteType.JUMPS);
		this.numberOfTry = numberOfTry;
	}

	@Override
	public String toString() {
		return "Jumps with " + numberOfTry + " number of tries, with the time for a round:" +
				timeOfRoundInMinutes + " and an avarage number of purticipants: " + numberOfParticipant;
	}
}
