package Demo;

public class Duplicate {
	
	public static void main(String [] args)
	{
		String a="velocity corporate training institute";
		String b="apple";
		 int   k=a.length();
		// System.out.println(c);
		int count=0;
		for(int i=0;i<=k-1;i++)  
		{
			char c=a.charAt(i);  //
			for (int j=i+1;j<=k-1;j++)  
			{	
			    char J=a.charAt(j);    //
			//	System.out.println(k);
				if(c==J && c!=' ')
				{
				count++;
				J=a.charAt(0);
				}
			}
			if(count> 1)
			{
			System.out.println(a.charAt(i)+"=" +count);
			}
			count=1;
		 }
	}
}
