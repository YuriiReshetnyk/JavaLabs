package ua.lviv.iot.Athletes;

public class Run extends Athletes{
	
	private float distanceInM;
	
	public float getDistanceInM() {
		return distanceInM;
	}
	
	public Run(float timeOfRoundInMinutes, int numberOfPurticipent, float distanceInM) {
		super(timeOfRoundInMinutes, numberOfPurticipent);
		this.distanceInM = distanceInM;
	}
	
	@Override
	public String toString() {
		return "Run on " + distanceInM + " with the time for a round:" + 
	timeOfRoundInMinutes + " and an avarage number of purticipants: " + numberOfPurticipent;
	}
}
