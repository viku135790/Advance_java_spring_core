package Spring_core_with_annotation.entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Company.class);
		Company company=(Company) applicationContext.getBean("hello");
		
		company.display();
	}

}
