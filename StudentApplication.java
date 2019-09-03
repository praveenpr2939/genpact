/*
import java.util.Scanner; // for scanner

public class StudentApplication {
	
	public void showMenu() {
		System.out.println("menu is shown");
		System.out.println("1. create student");
		System.out.println("2. Display Student");
		System.out.println("3. Exit");

	}

	public static void main(String[] args) {

		/*
		
		Student s = new Student(); // 's' is a reference variable
									// 'new' creates memory in heap
									// 's' is refering to the address of the object
									// 's' is an object of student

		s.init(101, "anita", 50.7f);
		s.display();

		Student s1 = new Student();

		s1.init(102, "Kumar", 60.7f);
		s1.display();
		
		// to increase the marks of students

		float mar=s.getMarks();
		mar=mar+7;
		
		s.setMarks(mar);
		
		int roll=s.getRollno();
		roll=103;;
		
		s.setRollno(roll);
		
				
		String nam="Anitha";
		s.setName(nam);
		s.display();
		s.calculateGrade(mar);
		
		//  showMenu(); //this is wrong static cant access non static methos
		// either make showMenu static or use object of StudentApplication to access
		StudentApplication sa=new StudentApplication();
		sa.showMenu();  // this works
		// but making it static is easier
		 
		 
		 */
		
		//inbuilt class Scanner
		/*
		Scanner sc=new Scanner(System.in); // 'in' is a object of the System class
		System.out.println("Enter choice 1, 2 or 3");
		int choice=sc.nextInt();
		Student s3=null; // must be initialized as it is local variable
		switch(choice) {          // choice can only be byte, short, int, char, enum, string
		case 1:
				System.out.println("enter roll no");
				int m_rollno = sc.nextInt();
				System.out.println("enter name");
				//String m_name = sc.nextLine();   this doesnt work, you have to create a sc onject again to use nextLIne
				sc=new Scanner(System.in);
				String m_name = sc.nextLine();
				System.out.println("enter marks");
				
				Float m_marks = sc.nextFloat();
				s3=new Student(m_rollno, m_name, m_marks);
				break;
		case 2: 
				
				break;
		case 3: //
				break;
		default: System.out.println("wrong choice");
		}
		
	}
}
*/

