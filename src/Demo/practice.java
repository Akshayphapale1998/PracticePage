package Demo;

public class practice {
	
	public static void T(int n)
	{
     int i,j,k;
	
	 for(i=n;i>=1;i--)
	  {
		for(j=0;j<i;j++)
		{
			System.out.print(" *");
		}	
			/*for(k=1;k<i;k++)
			{
				System.out.print("*");
			}*/
		System.out.println();
	  }
	}
	public static void main(String[] args)
	{
	  practice.T(5);

    }
}
