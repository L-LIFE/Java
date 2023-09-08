package reference;

public class Subject {
	//메소드 구현
	String subjectName;
	int score;
	
	public Subject(String name) {
		subjectName=name;
	}
	
	public void setSubjectName(String name) {
		subjectName=name;
	}

	public int getScore() {
		return score;
	}

	//각 멤버변수의 get,set코드를 자동으로 만드는 방법.
	//메뉴: source->..Getters and setters...->선택.
	public void setScore(int score) {
		this.score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}
	

}
