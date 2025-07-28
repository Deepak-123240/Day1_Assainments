package ENUM;

enum TrafficLight {
    RED(60),    // Red light for 60 seconds
    GREEN(45),  // Green light for 45 seconds
    YELLOW(5);  // Yellow light for 5 seconds

    private final int durationInSeconds;

    // Constructor
    TrafficLight(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    // Getter
    public int getDuration() {
        return durationInSeconds;
    }
}


	public class Challenge5 {
		public static void main(String[] args) {
			for (TrafficLight light : TrafficLight.values()) {
	            System.out.println(light + " light lasts for " + light.getDuration() + " seconds.");
	        }
		}
	

}
