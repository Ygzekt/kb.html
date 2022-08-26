class A
{
	private int n1;
	
	public A(int n)
	{
		System.out.println("n1의 값을 초기화한다.");
		this.n1=n;
	}
	
	public void setN(int a)
	{
		this.n1=a;
	}
	public int getN()
	{
		return this.n1;
	}
	public int Sum(int a, int b)
	{
		System.out.println("매개변수 있는 sum함수 사용");
		return a+b;
	}
	public int Sum()
	{
		System.out.println("매개변수 없는 sum 함수 사용");
		return 1;
	}
}
class B extends A
{
	private int n2;
	
	public B(int a, int b)
	{
		super(a);
		this.n2=b;
	}
	public void setN(int a)
	{
		this.n2=a;
	}
	public int getN()
	{
		return this.n2;
	}
}
public class main1 {
	public static void main(String[] args) {
		A a=new A(1);
		A aaaa=new A(2);
		
		B b=new B(3,4);
		
		System.out.println("a의 n1 값은 "+a.getN());
		
		a.Sum();
		a.Sum(2,4);
		
		System.out.println("a 객체의 값: "+a.getN());
		System.out.println("b 객체의 값: "+b.getN());
	}
}
