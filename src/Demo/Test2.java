package Demo;

public class Test2 {	
	public void R_trangle(int n)
	{
		int i,j,k,c=0;
		 for(k=n;k>=1;k--) 	 
		  {
		 	c++;
		 	c++;
		 	for(j=0;j<=c;j++)
		 	{
		 		System.out.print(" ");
		 	}
		 	for(i=1;i<=k;i++) 
		 	 {
		 		 System.out.print("* ");
		 	 }
		 	System.out.println();
		  }	
	}
	public static void main(String [] args)
	{
		Test2 Test2=new Test2();
		Test2.R_trangle(5);
		practice.T(5);
		Test2.R_trangle(5);
	}
}
