
abstract class Animal
{
	abstract String getName();
	abstract void printcry();
}

class Dog extends Animal
{
	private String name;
	public Dog()
	{
		this.name="강아지";
	}
	public String getName()
	{
		return this.name;
	}
	public void printcry()
	{
		System.out.println("월월월");
	}
}

class Cat extends Animal
{
	private String name;
	public Cat()
	{
		this.name="고양이";
	}
	public String getName()
	{
		return this.name;
	}
	public void printcry()
	{
		System.out.println("야오오옹");
	}
}


public class java03 {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		System.out.print(d.getName()+"의 울음소리는 ");
		d.printcry();
		
		System.out.print(c.getName()+"의 울음소리는 ");
		c.printcry();
	}

}
