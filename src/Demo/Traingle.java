package Demo;

public class Traingle {
	
	public void single() {
        int i,j,k,n=5;
		for (i=0;i<=n;i++)
		{
			for(k=5;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" *  ");
			}
			System.out.println();
			
		}
	}
      public void RTrangle() {
		int i,j,k,n=4;
		for(i=1;i<=n;i++)  //2
		{
			for(k=0;k<=i;k++)
			{ 
				System.out.print("  ");	
			}
			for(j=4;j>=i;j--)
			{	
					System.out.print("  * ");		
			}
			System.out.println();
		}
		}
	public static void main(String []args)
	{
		Traingle Traingle=new Traingle();
		Traingle.single();
		//System.out.println();
		Traingle.RTrangle();
	}

}
