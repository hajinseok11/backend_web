package exam02;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("기본생성자 - SamsungTV");
	}
	public void turnOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
}
