package array;

public class Book {
	private String bookName; //책이름
	private String author; //저자
	
	//두 코드는 위의 private만들자마자 바로 생각해야 하는 것.
	public Book() {}
	public Book(String bookName, String author) {
		this.bookName=bookName;
		this.author=author;
	}
	
	//자동생성 source->..Getters and setters...
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//정보를 나타내는 메서드
	public void showBookInfo() {
		System.out.println(bookName+","+author);
	}
	

}
