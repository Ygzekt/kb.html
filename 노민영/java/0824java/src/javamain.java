import java.util.Scanner;

class A{
	private int n1;
	
	public A(int a)
	{
		this.n1=a;
		System.out.println("클래스 A의 멤버 n1 값 저장 완료");
		System.out.println("저장된 n1의 값: "+this.n1);
	}
}
class B extends A{
	private int n2;
	
	public B(int a, int b)
	{
		super(a);
		this.n2=b;
		System.out.println("클래스 B의 멤버 n2 값 저장 완료");
		System.out.println("저장된 n2의 값: "+this.n2);
	}
}

public class javamain {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		A a=new A(i);
		
		int j=s.nextInt();
		int k=s.nextInt();
		B b=new B(j,k);
	}

}
