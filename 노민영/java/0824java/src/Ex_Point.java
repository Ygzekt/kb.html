import java.util.Scanner;

class Point
{
	private int x;
	private int y;
	public Point(int a, int b) 
	{
		this.x=a;
		this.y=b;
	}
	
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	public void print() 
	{
		System.out.println("x좌표: "+this.x);
		System.out.println("y좌표: "+this.y);
	}
}

class ColorPoint extends Point
{
	private String color;
	public ColorPoint(int a, int b, String s) 
	{
		super(a,b);
		this.color=s;
	}
	public void print()
	{
		System.out.println("x좌표: "+this.getX());
		System.out.println("y좌표: "+this.getY());
		System.out.println("색상: "+this.color);
	}
}

public class Ex_Point {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("점1에 댜한 정보(x,y,color): ");
		int x1=s.nextInt();
		int y1=s.nextInt();
		Point p1=new Point(x1,y1);
		
		System.out.print("점2에 댜한 정보(x,y,color): ");
		int x2=s.nextInt();
		int y2=s.nextInt();
		String color=s.next();
		ColorPoint p2=new ColorPoint(x2,y2,color);
		System.out.println();
		
		p1.print();
		System.out.println();
		p2.print();
	}
}
