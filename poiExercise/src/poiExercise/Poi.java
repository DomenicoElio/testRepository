package poiExercise;

public class Poi {
	private String name; 
	private double latitude;
	private double longitude;
	private double altitude;
	private String referenceCounty;
	private String description;
	private String category;
	
	public Poi (String name,double latitude, double longitutde, double altitude, String referenceCounty,
			    String description,String category){
		this.setName(name);
		this.setLatitude(latitude); 
		this.setLongitude(longitude);
		this.setAltitude(altitude);
		this.setReferenceCounty(referenceCounty);
		this.setDescription(description);
		this.setCategory(category);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitutde) {
		this.longitude = longitutde;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public String getReferenceCounty() {
		return referenceCounty;
	}
	public void setReferenceCounty(String referenceCounty) {
		this.referenceCounty = referenceCounty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
