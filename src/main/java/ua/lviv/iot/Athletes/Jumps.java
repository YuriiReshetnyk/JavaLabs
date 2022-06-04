package ua.lviv.iot.Athletes;

public class Jumps extends Athletes {

	private int numberOfTry;

	public Jumps(int avarageNumberOfParticipant, double timeOfRoundInMinutes, int numberOfTry) {
		super(AthleteType.JUMPS, avarageNumberOfParticipant, timeOfRoundInMinutes);
		this.numberOfTry = numberOfTry;
	}

	public int getNumberOfTry() {
		return numberOfTry;
	}

	public void setNumberOfTry(int numberOfTry) {
		this.numberOfTry = numberOfTry;
	}

	@Override
	public String toString() {
		return "Jumps with " + numberOfTry + " number of tries, with the time for a round:" + getTimeOfRoundInMinutes()
				+ " and an avarage number of purticipants: " + getAvarageNumberOfParticipant();
	}
}