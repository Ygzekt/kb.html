import java.util.Scanner;

class Person{
	private String name;
	private int height;
	private String gender;
	
	public Person(String n, String g) {
		this.name=n; this.gender=g;
	}
	
	
	public void setName(String n) {this.name = n;}
	public String getName() {return this.name;}
}

class Student extends Person{
	private int num;
	private String ablity;
	
	public Student(String n, String g, int num) {
		super(n, g);
		this.num=num;
	}
}

public class java0823 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Person p=new Person();
		Student stu=new Student();
		
		p.setName("Leeyuna");
		p.setNum(18130956);
		
		stu.setName("Leeyuna");
		stu.setNum(18130956);
	}

}
