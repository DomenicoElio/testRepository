package poiExercise;

public class StaticVector {
	
	private Poi [] pointsOfInterest;
	
	public StaticVector(Poi[]pointsOfInterest) {
		this.pointsOfInterest = new Poi[pointsOfInterest.length];
		for(int i=0; i<pointsOfInterest.length;i++) {
			this.pointsOfInterest[i]=pointsOfInterest[i];
		}
	}

	public Poi [] getPointsOfInterest() {
		return pointsOfInterest;
	}

	public void setPointsOfInterest(Poi [] pointsOfInterest) {
		this.pointsOfInterest = pointsOfInterest;
	}

}
