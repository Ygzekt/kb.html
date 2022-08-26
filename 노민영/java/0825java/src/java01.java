
class Phone
{
	private String name;
	private String num;
	
	public Phone(String na, String nu)
	{
		this.name=na;
		this.num=nu;
	}
	public String getName() {return this.name;}
	public String getNum() {return this.num;}
	public void print()
	{
		System.out.println("phone의 print 실행");
		System.out.println("휴대폰 정보");
		System.out.println("폰 기종: "+this.name);
		System.out.println("폰 번호: "+this.num);
	}
}

class SmartPhone extends Phone
{
	private String androidver;
	private String account;
	
	public SmartPhone(String na, String nu, String a)
	{
		super(na,nu);
		this.androidver="7";
		this.account=a;
	}
	public void print()
	{
		System.out.println("스마트폰 정보");
		System.out.println("폰 기종: "+this.getName());
		System.out.println("폰 번호: "+this.getNum());
		System.out.println("안드로이드 버전: "+this.androidver);
		System.out.println("계정: "+this.account);
	}
}

public class java01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new Phone("5G폰","010-1111-2222");
		SmartPhone sp=new SmartPhone("갤럭시 A7","010-2657-8996","shalsdud1004");

		p.print();
		System.out.println();
		sp.print();
	}

}
