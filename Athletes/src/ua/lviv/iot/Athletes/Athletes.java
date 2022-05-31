package ua.lviv.iot.Athletes;

public class Athletes {
	
	protected int numberOfPurticipent;
	protected float timeOfRoundInMinutes;
	
	public int getNumberOfPurticipent() {
		return numberOfPurticipent;
	}
	
	public float getTimeOfRoundInMinutes() {
		return timeOfRoundInMinutes;
	}
	
	@Override
	public String toString() {
		return "Sport with time of a round: " + timeOfRoundInMinutes + 
               " and an avarage number of purticipants: " + numberOfPurticipent;
	}
	
	public Athletes(float timeOfRoundInMinutes, int numberOfPurticipent) {
		this.timeOfRoundInMinutes = timeOfRoundInMinutes;
		this.numberOfPurticipent = numberOfPurticipent;
	}
}
