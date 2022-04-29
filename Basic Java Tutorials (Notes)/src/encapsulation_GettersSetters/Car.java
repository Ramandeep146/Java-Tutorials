package encapsulation_GettersSetters;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
	    // since we are setting the make within the setter method
		// we no longer need the line this.make = make;
		// what we could do is call the setMake method within the constructor now 
		// and for other attributes (model and year) as well
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	// getter methods
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return year;
	}
	
	// setter methods
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	

}
