import java.util.Scanner;
class FExample1A
{
	public static void main(String args[])
	{
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		a = s.nextInt();
		if(a < 0)
		{
			System.out.println("The the number is negative");
		}
		else if(a > 0) 
		{
			System.out.println("The the number is Positive");

		}
		else
		{
			System.out.println("The number is zero");
		}


	}
}