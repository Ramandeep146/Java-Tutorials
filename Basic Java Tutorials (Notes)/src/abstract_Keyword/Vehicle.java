package abstract_Keyword;


// adds a layer of security to this program. 
// Example: we need to buy a vehicle which can be a car or bike or etc which is a vehicle, 
//         but we cannot say that we want 'Vehicle' without specifying which one
// Force to user to pick certain type of vehicle
public abstract class Vehicle {
	
	// abstract can also be used with methods
	// but these methods do not specify body (so no body using {})
	abstract void go();

}
