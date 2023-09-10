package inheritance;

public class Circle{
	
	//Point안에 있는 점을 사용하고 싶다면 상속을 사용하는 것이 아니라
	//그냥 선언을 하면 된다.
	//상속은 안에 있는 내용을 사용하면서 좀 더 구체적인 것을 요구할 때 사용하는 거임.
	
	Point point; //has-a 관계
	
	//is-a관계
	
	//private int radius;
	
	public Circle() {
		point=new Point();
	}

}
