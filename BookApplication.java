
public class BookApplication {

	public static void main(String[] args) {
		Book b=new Book(100, "Sherlock Holmes", "conan Doyle", "Trade Books", 350.0f);
		Book b1=new Book();
		b1.init(101, "Percy Jackson", "Jack Olsen", "Entertain Media", 455.5f);
		Book b2=new Book(102, "Wings Of Fire", "Abdul kalam", "Dream Works", 250.0f);
		
		b.display();
		b1.display();
		b2.display();
		
		float price=b.getPrice();
		price=price*0.9f;		
		b.setPrice(price);	
				
		price=b1.getPrice();
		price=price*0.9f;		
		b1.setPrice(price);
		
		price=b2.getPrice();
		price=price*0.9f;		
		b2.setPrice(price);
		
		b.display();
		b1.display();
		b2.display();	

	}

}
