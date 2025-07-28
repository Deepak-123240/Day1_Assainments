package Variables;

public class Challenge4 {
	public static final double PI = 3.14159;
	public static final int MAX_SCORE = 100;

	public static void main(String[] args) {

		double radius = 5.0;
        double circleArea = PI * radius * radius;
        System.out.printf("Area of circle: %.2f\n", circleArea);
        
        int currentScore = 85;
        double percentage = (double) currentScore / MAX_SCORE * 100;
        System.out.printf("Percentage: %.1f%%\n", percentage);
	}

}
