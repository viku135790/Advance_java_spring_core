package spring_core_with_setter_method_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MySpring.xml");
		Student student=(Student) applicationContext.getBean("yourownid");
		
		System.out.println(student.getRollnumber());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
	}
	
}
