package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
		
	}
	//이 부분이 핵심!!-> 객체의 협업
	//Bus bus는 생성된 인스턴스가 매개변수로 들어와야 한다.
	public void takeBus(Bus bus) {
		bus.take(1000); //버스 돈은 증가
		money-=1000; //내돈은 감소		
	}
	//Subway subway는 생성된 인스턴스가 매개변수로 들어와야 한다.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money-=1500;
	}
	
//	public void takeTrans(Trans trans) {
//		
//	}
	
	public void showInfo() {
		System.out.println(studentName+"님은 남은 돈은"+money+"입니다.");
	}

}
