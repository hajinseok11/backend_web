package di.annotation.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/anno.xml");
		AbstractPlayer p = factory.getBean("player", AbstractPlayer.class);
		p.play();
		System.out.println("세번 굴린 주사위의 합:"+p.getTotalValue());
	}

}
