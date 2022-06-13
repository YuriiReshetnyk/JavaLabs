package ua.lviv.iot.Athletes;


public class Athletes {

	AthleteType athleteType;
	int avarageNumberOfParticipant;
	double timeOfRoundInMinutes;

	public Athletes(AthleteType athleteType, int avarageNumberOfParticipant, double timeOfRoundInMinutes) {
		this.athleteType = athleteType;
		this.avarageNumberOfParticipant = avarageNumberOfParticipant;
		this.timeOfRoundInMinutes = timeOfRoundInMinutes;
	}

	public AthleteType getAthleteType() {
		return athleteType;
	}

	public void setAthleteType(AthleteType athleteType) {
		this.athleteType = athleteType;
	}

	public int getAvarageNumberOfParticipant() {
		return avarageNumberOfParticipant;
	}

	public void setAvarageNumberOfParticipant(int avarageNumberOfParticipant) {
		this.avarageNumberOfParticipant = avarageNumberOfParticipant;
	}

	public double getTimeOfRoundInMinutes() {
		return timeOfRoundInMinutes;
	}

	public void setTimeOfRoundInMinutes(double timeOfRoundInMinutes) {
		this.timeOfRoundInMinutes = timeOfRoundInMinutes;
	}

	public String getHeaders() {
		return "athleteType, avarageNumberOfParticipant, timeOfRoundInMinutes";
	}

	public String toCSV() {
		return athleteType + ", " + avarageNumberOfParticipant + ", " + timeOfRoundInMinutes;
	}

	@Override
	public String toString() {
		return "Sport with time of a round: " + timeOfRoundInMinutes + " and an avarage number of purticipants: "
				+ avarageNumberOfParticipant;
	}
}