package staticex;

public class Student {
	
	private static int seriaNum=10000;//외부에서 마음대로 증가시키면 안되기에 private함.
	int studentID;
	String studentName;
	
	public Student() {
		seriaNum++;//증가되면서 공유되고
		studentID=seriaNum;//내 id에는 각각 다른 시리어넘버가 저장이 된다.
	}

	//가져가서 볼 수 있게만 함.
	public static int getSeriaNum() {
		//이 안에서만 출력할 것이 있다면 아래와 같이 코드를 사용할 수 있음
		//지역변수이기에 다른 곳에서는 사용할 수 없음.
		//int i=0;
		//i++;
		//System.out.println(i);
		
		//인스턴스 변수(멤버변수)이기에 static메소드에서는 사용할 수 없음.
		//studentName="홍길동";
		
		//static 변수, 클래스 변수
		return seriaNum;
	}
	
//	값을 변경시키면 안되기에 이 코드는 사용하면 안된다.
//	public static void setSeriaNum(int seriaNum) {
//		Student.seriaNum = seriaNum;
//	}

	
}
