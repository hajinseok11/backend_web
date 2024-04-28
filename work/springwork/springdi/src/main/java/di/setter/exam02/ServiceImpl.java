package di.setter.exam02;

public class ServiceImpl implements MyService {
	String name;
	String msg;
	Logic logic;
	public ServiceImpl() {
	}
	// Main만들때 ServiceImpl의 testService 메소드를 호출
	public ServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Logic getLogic() {
		return logic;
	}
	public void setLogic(Logic logic) {
		this.logic = logic;
	}
	@Override
	public void testService() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}
}
