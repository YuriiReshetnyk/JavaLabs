package ua.lviv.iot.Athletes;

public class Run extends Athletes {

	private double distanceInM;

	public double getDistanceInM() {
		return distanceInM;
	}

	public void setDistanceInM(double distanceInM) {
		this.distanceInM = distanceInM;
	}

	public Run(int avarageNumberOfParticipant, double timeOfRoundInMinutes, double distanceInM) {
		super(AthleteType.RUN, avarageNumberOfParticipant, timeOfRoundInMinutes);
		this.distanceInM = distanceInM;
	}

	@Override
	public String toString() {
		return "Run on " + distanceInM + " with the time for a round:" + getTimeOfRoundInMinutes()
				+ " and an avarage number of purticipants: " + getAvarageNumberOfParticipant();
	}
	
	@Override
	public String getHeaders() {
		return super.getHeaders() + ", distanceInM";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + ", " + distanceInM;
	}
}