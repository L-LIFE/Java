package staticex;

public class StudentTest {

	public static void main(String[] args) {
		//static변수를 참조할 때는 클래스 이름으로 불러온다.(참조변수를 쓰지 않음.)
		System.out.println(Student.getSeriaNum());
		
		Student studentJ=new Student();
		System.out.println(studentJ.getSeriaNum());
		
		Student studentT=new Student();
		System.out.println(studentT.getSeriaNum());
		
		
		//두 인스터스가 공유되고 있다는 것을 알 수 있음.
//		System.out.println(studentJ.seriaNum);
//		System.out.println(studentT.seriaNum);

	}

}
