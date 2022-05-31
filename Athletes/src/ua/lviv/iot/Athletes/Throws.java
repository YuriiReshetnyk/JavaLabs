package ua.lviv.iot.Athletes;

public class Throws extends Athletes{
	
	private float weight;
	
	public float getWeight() {
		return weight;
	}
	
	public Throws(float timeOfRoundInMinutes, int numberOfPurticipent, float weight) {
		super(timeOfRoundInMinutes, numberOfPurticipent);
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Throws of " + weight + " kilograms, with the time for a round:" + 
				timeOfRoundInMinutes + " and an avarage number of purticipants: " + numberOfPurticipent;
	}
}
