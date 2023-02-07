package spring_core_with_constructor_injection;

public class Car {
	private String carName;
	private String carColor;
	private int carPrice;
	
	
	Car(String carName, String carColor, int carPrice){
		super();
		this.carName=carName;
		this.carColor=carColor;
		this.carPrice=carPrice;
		
	}
	public String toString() {
		return ("carname = "+ carName+"\ncarcolor = "+carColor+"\ncarprice = "+carPrice);
	}

}
