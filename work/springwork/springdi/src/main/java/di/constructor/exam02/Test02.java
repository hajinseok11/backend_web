package di.constructor.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/constructor.xml");
		
		MyService bean = factory.getBean("service",Myservice.class);
		bean.testService();
		
	}

}
