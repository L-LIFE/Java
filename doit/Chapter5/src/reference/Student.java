package reference;

public class Student {
	
	int studentID;
	String studentName; //new하지 않아도 사용할 수 있는 클래스가 존재함.
	//참조자료형
	Subject korea;
	Subject math;
	
	//참조자료형 
	public Student() {
		//아래와 같이 생성자를 만들때 변경되지 않은 내용을 미리 정해주면 코드가 깔끔해진다.
		korea=new Subject("국어");
		math=new Subject("수학");
	}
	
	//생성자 오버라이딩
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		
		korea=new Subject("국어");
		math=new Subject("수학");
	}

	public void setKorea(int score) {
		korea.setScore(score);
		
		//korea.subjectName=name;//이렇게 써도 가능
	}
	public void setMath( int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total=korea.getScore()+math.getScore();
		System.out.println(studentName+"학생의 총점은 "+total+"점 입니다.");
	}
}
