abstract class Phone
{
	abstract public int getNum();
	abstract public String getName();
	abstract void print();
}

class CellPhone extends Phone
{
	private int num;
	private String name;
	
	public CellPhone()
	{
		this.num='1';
		this.name="s2";
	}
	public int getNum()
	{
		return this.num;
	}
	public String getName()
	{
		return this.name;
	}
	public void print()
	{
		System.out.println("쉬리야~");
	}
}

class SmartPhone extends CallPhone
{
	private int androidver;
	private String account;
	
	public SmartPhone()
	{
		this.androidver='7';
		this.account="A7";
	}
	
}

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
