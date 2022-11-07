package Demo;

public class Homework3 {
	public void Test() {
		int i,j,k,n=1,c=3;
		for(i=3;i>=n;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
    public void Test1() {
		int i,j,k,c=3;
		for(i=3;i>=1;i--)
		{
			for(k=0;k<=c;k++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		c++;
		c++;
		}
	}

	public static void main(String [] args)
	{
		Homework3 Homework3=new Homework3();// object
		Homework3.Test();					//function call
	    Homework3.Test1();
		
	}

}
