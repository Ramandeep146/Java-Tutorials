package copy_Objects;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	// copy method
	public void copy(Car x) {
		// car2 is the one that called this method so use 'this'
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
	
	// 2nd way
	Car (Car x){
		this.copy(x);
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
