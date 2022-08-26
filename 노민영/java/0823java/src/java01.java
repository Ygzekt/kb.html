import java.util.Scanner;

class Person1
{
	private String name;
	private int age;
	

	public Person1(String n,int a)
	{
		this.name=n;
		this.age=a;
	}
	public String getName() {return this.name;}
	public int getAge(){return this.age;}
}

class Student1 extends Person1
{
	private String ShoolName;
	public Student1(String n,int a, String s)
	{
		super(n,a);
		this.ShoolName=s;
	}
	public void print()
	{
		System.out.println("학생 정보");
		System.out.println("이름: "+ this.getName());
		System.out.println("나이: "+this.getAge());
		System.out.println("소속: "+this.ShoolName);
	}
}

class Teacher1 extends Person1
{
	private String Company;
	
	public Teacher1(String n, int a, String c)
	{
		super(n,a);
		this.Company=c;
	}	
	
	public void print()
	{
		System.out.println("교사 정보");
		System.out.println("이름: "+ this.getName());
		System.out.println("나이: "+this.getAge());
		System.out.println("소속: "+this.Company);
	}
	
}

public class java01 {
	public static void main(String args[])
	{
		Student1 stu=new Student1("노민영",27,"kb");
		Teacher1 t=new Teacher1("이유나",24,"kb");
		
		stu.print();
		System.out.println();
		t.print();
		
	}
}
