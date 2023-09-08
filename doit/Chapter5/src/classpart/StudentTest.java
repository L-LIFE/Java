package classpart;

public class StudentTest {
	public static void main(String[] args) {
		
		//들여쓰기 주의
		//생성자를 만들어준 경우 이와 같이 변경하여 오류를 없앨 수 있음.(주석처리한 코드)
//		Student studentLee=new Student(100,"이순신");
//		studentLee.address="서울시 영등포구 여의도동";
		
		Student studentLee=new Student();
		studentLee.studentName="이순신";
		studentLee.studentID=100;
		studentLee.address="서울시 영등포구 여의도동";
		
		Student studentKim=new Student();
		studentKim.studentName="김유신";
		studentKim.studentID=101;
		studentKim.address="미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		//클래스 풀 네임(패키지이름).클래스@16진수의 주소값
		//참조값
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
