package spring_core_with_constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MySpring.xml");
		Car car=(Car) applicationContext.getBean("writeyourid");
		
		System.out.println(car.toString());
	}

}
