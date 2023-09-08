package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student james=new Student("James", 5000);
		Student tomas=new Student("Tomas", 10000);
		
		Bus bus100=new Bus(100); //생성자와 함께 lineName을 넘겨준다.
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen=new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();

	}

}
