import java.util.Scanner;
class FExample1B
{
	public static void main(String[] args) {
		int a,b,dig1,dig2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value");
		a = sc.nextInt();
		System.out.println("Enter the 2nd value");
		b = sc.nextInt();
		System.out.println("The values are:"+a+","+b);
		dig1 = a % 10;
		dig2 = b % 10;
		if(dig1 == dig2)
		{
			System.out.println("True, because the last digit are same");

		}
        else
        {
        	System.out.println("False, because the last digit are not same");
        }

	}
}