package Demo;

import java.util.Scanner;

public class Non_Static {
	
	public static void demo()//  static
	{
		int i=1,n,j,c;
	    Scanner obj=new Scanner(System.in);
		System.out.println("How much no you want to check ");
		n=obj.nextInt();
		System.out.println("Please find below prime No 1 to "+n);
		 
	 for(i=1;i<=n;i++) //true 1,2
	  {
		 c=0;
		for(j=1;j<=i;j++)//true 1,2
		{
			if(i%j==0) 
			{
				//System.out.println();
				c++;       //1,2
			}
		}
		if(c==2)
		   {
			System.out.println(i);
		   }
		}
	}

}
