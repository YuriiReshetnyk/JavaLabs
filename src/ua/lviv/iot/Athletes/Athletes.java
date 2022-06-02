package ua.lviv.iot.Athletes;

public class Athletes {

	protected AthleteType athleteType;
	protected int numberOfParticipant;
	protected float timeOfRoundInMinutes;

	public Athletes(float timeOfRoundInMinutes, int numberOfParticipant, AthleteType athleteType) {
		this.athleteType = athleteType;
		this.timeOfRoundInMinutes = timeOfRoundInMinutes;
		this.numberOfParticipant = numberOfParticipant;
	}

	public int getNumberOfParticipant() {
		return numberOfParticipant;
	}

	public float getTimeOfRoundInMinutes() {
		return timeOfRoundInMinutes;
	}

	public AthleteType getAthleteType() {
		return athleteType;
	}

	@Override
	public String toString() {
		return "Sport with time of a round: " + timeOfRoundInMinutes +
				" and an avarage number of purticipants: " + numberOfParticipant;
	}
}
