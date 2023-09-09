package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];

		bookArray1[0]=new Book("태백산맥1","조정래");
		bookArray1[1]=new Book("태백산맥2","조정래");
		bookArray1[2]=new Book("태백산맥3","조정래");
		
		//직접 복사) 를 한다면 빈 공간이 필요하다.
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		//이렇게 따로 인스턴스를 잡아준다면 bookArray1의 변경한 내용이 bookArray2에 영향을 주지 않는다.
		//깊은 복사
		
		//직접 복사)
		for(int i=0;i<bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		//직접 복사가 아니라면 위처럼 공간을 생성할 필요없이 이 문구를 작성하면 됨.
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		//for(int i=0; i<bookArray2.length;i++) {
		//	bookArray2[i].showBookInfo();
		//}
		
		//메서드를 사용하여 변수의 값을 변경해줌.
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		//for(int i=0; i<bookArray1.length; i++) {
		//	bookArray1[i].showBookInfo();
		//}
	
		//System.out.println("==============");
		
		//for(int i=0; i<bookArray2.length; i++) {
		//	bookArray2[i].showBookInfo();
			//bookArray1이 변경된 후 같이 바뀐 것을 볼 수 있음.
		//}
		//객체배열의 복사! 같이 변경이 됨.
		//결국은 주소가 복사가 된 것이다(=얕은 복사)
		
		String[] strArr= {"Java","Android","C"};
		
//		for(int i=0; i<strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		
		//만약 처음부터 length-1까지 돈다면
		for(String s : strArr) {
			System.out.println(s);
		}//변수인 s에 하나하나 들어가서 출력하게 되는 것.
		//기존의 for문과 다르게 간단함.
		
		int[] arr= {1,2,3,4,5};
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
