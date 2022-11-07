package Demo;

public class double_trangle {

	public static void main(String [] args)
	{	
	int i,j,n=5,s,p=0,q=1;
	while(p<=q)
	{
	for(i=0;i<=n;i++)
	 {
		for(s=5;s>=i;s--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();	
	 }
	//System.out.println("Akshay");
	for(i=1;i<=n;i++)
	{
		for(s=0;s<=i;s++)
		{
			System.out.print(" ");
		}
		for(j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}p++;
	}
	}
}
