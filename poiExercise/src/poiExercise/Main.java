package poiExercise;

public class Main {

	public static void main(String[] args) {
		
		Poi portland = new Poi("Portland", 15.50, 16.60, 17.70, "Portland Metropolitan Area", "Beautiful", "Cityscape");
		Poi seattle = new Poi("Seattle", 15.50, 16.60, 17.70, "Seattle Metropolitan Area", "Fantastic", "Cityscape");
		Poi [] selectedPoints = new Poi [5];
		selectedPoints [0] = portland;
		selectedPoints [1] = seattle; 
		
	}
}
