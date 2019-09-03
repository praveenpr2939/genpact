
public class Student {
	private int rollno;
	private String name;
	private float marks;

	public void init(int r, String n, float m) {
		rollno = r;
		name = n;
		marks = m;
	}
	
	public Student(int r, String n, float m) {
		rollno = r;
		name = n;
		marks = m;
	}

	/*
	 * when object 's' was created a constructor was called by the compiler we don't
	 * have to call the constructor explicitly
	 * 
	 * constructor has the same name as the class public Student() {
	 * 
	 * }
	 * 
	 */

	/*
	 * // 'this' must be used because both the data member and local variable have
	 * same name. local variable takes precedence over here and here null value only
	 * will be assigned if not used 'this' not the data members value
	 * 
	 * public void init(int rollno, String name, float marks) { this.rollno =
	 * rollno; this.name = name; this.marks = marks; }
	 */

	// you can also create parameterized constructor
	/*
	 * if once given a parameterized constructor compiler does not provide default
	 * constructor for another object
	 * 
	 * 
	 */

	public void display() {
		System.out.println("Roll no : " + rollno);
		System.out.println("Name    : " + name);
		System.out.println("Marks   : " + marks);

	}

	// to increase the marks of students
	public float getMarks() {
		return this.marks;
	}

	public void setMarks(float marks) {
		this.marks=marks;
	}
	
	public int getRollno() {
		return this.rollno;
	}

	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
		
	public void setName(String name) {
		this.name=name;

	}
	
	
	public void calculateGrade(float marks) {
		if(marks>=80)
			System.out.println("Grade is A");
		else if(marks>=60)
			System.out.println("Grade is B");
		else if(marks>=40)
			System.out.println("Grade is C");
		else
			System.out.println("Grade is D");
	}
	// the above methods are called as getter and setter methods

}
