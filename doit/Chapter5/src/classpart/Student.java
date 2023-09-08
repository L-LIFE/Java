package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//기본적인 생성자: public Student() {}
	//이게 없어도 실행이 됨-> 자바 컴파일 과정에서 자동으로 생성해서 실행하기 때문.
	//이를 디폴트 생성자라고 하는 데 매개변수, 구현코드도 없음.
	//생성자가 하나라도 있는 경우 생성해주지 않음. 하나도 생성자가 없을 때만 생성함.
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		
	}//이와 같이 생성자가 하나라도 있는 경우, 생성자를 서포트해주지 않기에 오류가 발생할 수 있음.
	//위의 생성자를 만들어주었으면 오류를 방지하기 위해 StudentTest 클래스에서 변경하는 경우도 있지만,
	//디폴트생성자를 추가하여 오류를 제거하는 방법도 있음.
	public Student() {}
	
	public void showStudentInfor() {
		System.out.println(studentName+","+address);
	}
	//클래스 사용법1
	/*
	public static void main(String[] args) {
		Student studentLee =new Student();
		studentLee.studentName="이순신";
		studentLee.address="서울시 서초구 서초동";
		
		studentLee.showStudentInfor();
	}
	*/
	
	//클래스 사용법2: 다른 클래스가 존재하는 경우
	//StudentTest.java
	
	//함수추가
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
	
	//호출 시 이 부분이 먼저 시행이 되도록 하는 거임.
//	public static void main(String[] args) {
//		int i=10;//객체X
		
		//객체 타입, 속성들을 넣을 수 있으며 객체타입은 무조건 생성해야함.
		//대부분이 다른 클래스를  만들고 거기에 코드를 적어주는 경우가 많음.
//		Student studentLee=new Student();
//		studentLee.studentName="이순신";
//		studentLee.studentID=100;
//		studentLee.address="서울시 영등포구 여의도동";
//		
//		Student studentKim=new Student();
//		studentKim.studentName="김유신";
//		studentKim.studentID=101;
//		studentKim.address="미국 산호세";
//		
//		studentLee.showStudentInfor();
//		studentKim.showStudentInfor();
//	}
}
