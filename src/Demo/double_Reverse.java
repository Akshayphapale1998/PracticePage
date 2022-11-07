package Demo;

public class double_Reverse {
	public static void main(String [] args)

	{
		int i,j,n=5,p=0,q=1;
		while(p<=q)
		{
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}p++;
	   }
	}
}
