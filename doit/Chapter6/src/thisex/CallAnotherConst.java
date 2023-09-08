package thisex;

class Person{
	String name;
	int age;
	
	public Person() {
//		int i=0;
//		name="test";
//this를 쓸 때는 가장 먼저 나와야 오류가 발생하지 않는다.
		
		this("이름없음",1); 
		//데이터개수랑 자료형으로 맞는 것과 알아서 매핑이 된다.
		//안드로이드에서도 자주 나온다.
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//자기자신을 리턴하는 것이기에 Person을 해주면 된다.
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1=new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); //this값이 호출되는 것을 볼 수 있음.

	}

}
