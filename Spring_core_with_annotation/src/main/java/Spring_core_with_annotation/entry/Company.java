package Spring_core_with_annotation.entry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "hello")
public class Company {
	@Value(value = "TATA")
	private String name;
	@Value(value = "Automobiles")
	private String product;
	@Value(value = "458855588")
	private int capital;
	
	public void display() {
		System.out.println("CompanyName = "+name);
		System.out.println("CompanyProduct = "+product);
		System.out.println("Capital = "+capital);
	}

}
