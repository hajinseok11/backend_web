package di.annotation.exam02;

import org.springframework.stereotype.Repository;

@Repository
public class LogicImpl implements Logic {
	@Override
	public void testLogic() {
		System.out.println("db연동,xml,json,연산등을 수행하는 비지니스 메소드");
	}
}
