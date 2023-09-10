package abstractext;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Computer c1=new Computer();//오류
		//추상 클래스는 인스턴스화 할 필요가 없음.
		
		Computer c2=new DeskTop();
		//구현이 되어 있기에 위의 코드가 성립됨.
		//하위인스턴스를 상위 클래스로 생성가능.
		
		//추상 클래스인 NoteBook, MyNoteBook으로 아래의 코드를 사용할 수가 없음.
		//Computer c3=new NoteBook(); //추상 클래스로 만들 경우 이 코드를 사용X
		//Computer c4=new MyNoteBook(); //NoteBook c4=new MyNotebook(); 둘다 가능.
		
	}

}
