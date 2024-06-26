package di.annotation.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.annotation.exam02.MyService;
import di.annotation.exam02.ServiceImpl;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/anno.xml");
		
		InterMessage bean = factory.getBean("messageBean",MessageBean.class);
		bean.sayHello();
		
		Outputter fileoutputter = factory.getBean("fileoutputter",FileOutputter.class);
		fileoutputter.output("성공");
	}

}
