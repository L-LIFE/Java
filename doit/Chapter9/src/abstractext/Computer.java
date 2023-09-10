package abstractext;

public abstract class Computer {
	//추상클래스는 상속되기 위함으로 하위클래스가 이 클래스를 기반한 클래스를 구현할 거임.
	
	//구현코드X-> 추상메서드가 됨.: abstract
	//클래스도 추상 클래스가 되어야 한다.
	public abstract void display(); //구현은 안하고 선언만 한다는 의미.
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
