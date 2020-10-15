import java.util.Scanner;
class FExample17
{
	public static void main(String[] args) {
		int n,reverse = 0,remainder,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer");
		n =sc.nextInt();
		temp = n;
		while(n!=0)
		{
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		if(reverse == temp)
		{
			System.out.println("Is palindrome");

		}
		else
		{
			System.out.println("Is not palindrome");

		}
        
		
	}
}