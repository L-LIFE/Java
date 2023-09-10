package template;

public abstract class Car {
	
	//실행해주는 중심이므로 필요한 것은 여기서 변수를 만들어주면 좋다.
	//상위 클래스이기 때문. 하위클래스가 상위 클래스를 참고하기 때문이다.
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	//필요에 있어서 재정의 하는 것.
	public void washCar() {}
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//final 다른 클래스에서 변경할 수 없도록 함.
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar(); 
//washCar: 재정의를 하지 않은 경우 코드를 실행해도 아무런 내용이 나오지 않는다.
		turnOff();

	}
}
