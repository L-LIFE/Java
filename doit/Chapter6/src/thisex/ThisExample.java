package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	//this는 자바에서 자주 사용하는 것으로 잘 알고 넘어가기
	public void setYear(int year) {
		this.year=year;
	}
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1=new Birthday();
		Birthday b2=new Birthday();
		
		//코드는 this이지만 매번 가리키는 것은 그때의 인스턴스.
		System.out.println(b1);
		b1.printThis();
	
		System.out.println(b2);
		b2.printThis();
		
		

	}

}
