package Demo;
import java.util.Scanner;


public class ladder {
	public static void main(String[] args)
	{
	int a,b,c;
	
	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter The Frist Number");
	a=obj.nextInt();
	System.out.println("Enter The Second Number");
	b=obj.nextInt();
	System.out.println("Enter The Third Number");
	c=obj.nextInt();
	
	if(a>b)
	{
		System.out.println("Highest No Is" +a);
	}
	else if(b>c)
	{
		System.out.println("Highest No Is" +b);
	}
	else if(c>a)
	{
		System.out.println("Highest Value is "+c);
	}
	else if(a==b && b==c && a==c)
	{
		System.out.println("All Numbers are Same ");
	}
	}
}

