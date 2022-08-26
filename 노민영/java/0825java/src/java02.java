
abstract class Person
{
	abstract public void printName();
	abstract public void print();
}

class Me extends Person
{
	private String name;
	public Me(String n)
	{
		this.name=n;
	}
	
	public void printName()
	{
		System.out.println("제 이름은 "+this.name+"입니다.");
	}
	public void print()
	{
		System.out.println("잘부탁합니다.");
	}
}


public class java02 {

	public static void main(String[] args) {
		//Person p=new Person();
		Me m=new Me("노민영");
		
		m.printName();
		m.print();
	}

}
