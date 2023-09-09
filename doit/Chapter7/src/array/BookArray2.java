package array;

public class BookArray2 {

	public static void main(String[] args) {

		//객체 자료형은 각각 생성자를 만들어주어 넣어줘야 한다.
		Book[] library=new Book[5];
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}//처음에는 null의 값이 들어있었음
		
		library[0]=new Book("태백산백1","조정래");
		library[1]=new Book("태백산백2","조정래");
		library[2]=new Book("태백산백3","조정래");
		library[3]=new Book("태백산백4","조정래");
		library[4]=new Book("태백산백5","조정래");
		//각각의 인스턴스를 만들어주고 각 배열에 요소를 넣으니 주소값이 생겼음.
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();
		}

	}

}
