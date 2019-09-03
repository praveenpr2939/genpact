
public class Book {
	private int bookno;
	private String bookname, author, publisher ;
	private float price;
	
	public Book() {
		System.out.println("constructor is called here");
	}
	
	public void init(int bookno, String bookname, String author, String publisher, float price) {
		this.bookno=bookno;
		this.bookname=bookname;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
		
	public Book(int bookno, String bookname, String author, String publisher, float price) {
		this.bookno=bookno;
		this.bookname=bookname;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		
	}
	
	public void display() {
		System.out.println("Book No   : "+bookno);
		System.out.println("Book Name : "+bookname);
		System.out.println("Author    : "+author);
		System.out.println("Publisher : "+publisher);
		System.out.println("Price     : "+price);
	}
	
	public int getBookno() {
		return this.bookno;
	}
	public void setBookno(int bookno) {
		this.bookno=bookno;
	}
	public void setBookname(String bookname) {
		this.bookname=bookname;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public float getPrice() {
		return this.price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	
	
}

