package abstractext;

public class DeskTop extends Computer{

	
	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
		
	}

	/*public void turnOn() {
		System.out.println("DeskTop turnOn()");
	}//하위 클래스에서 재정의 가능
	*/
	

	
}
