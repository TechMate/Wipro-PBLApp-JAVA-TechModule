import java.util.Scanner;
class FExample21
{
	public static void main(String args[])
	{
		int a;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a posiitive integer");
		a = sc.nextInt();
		if(a % 2 == 0)
		{
			System.out.println(a+"is even");

		}
		else
		{
			System.out.println(a+"is odd");
		}


	}
}