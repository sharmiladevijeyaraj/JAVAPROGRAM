

public class FibanocciSeries 
{
	public static void main(String[] args) 
	{
		int a = 0, b = 1, n=100;
		
		System.out.println("Fibanocci series from 1 to 100\n");
		
		//Printing first number 
		System.out.print( b + "  " );
		
		//To perform fibanocci logic
		for(int i = 2; i <= n; i++)
		{
			int val = a + b;	
			if (val <= n)
			{ 
			System.out.print( val + "  " );
			a = b;
			b = val;
			}
		}
	}

}
