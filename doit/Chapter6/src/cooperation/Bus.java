package cooperation;

public class Bus {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	//동일한 변수의 이름을 사용하면 가독성이 증가함.
	public Bus(int lineNumber) {
		this.lineNumber=lineNumber;
	}
	public void take(int money) {
		this.money+=money;
		passengerCount++;
		
	}
	public void showInfo() {
		System.out.println("버스"+lineNumber+"번의 승객은"+passengerCount
				+"명이고, 수입은"+money+"입니다.");
	}

}
