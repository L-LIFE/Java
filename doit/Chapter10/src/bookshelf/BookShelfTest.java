package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue=new BookShelf();
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		//1,2,3순서대로 출력하게 된다.
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());

	}

}
