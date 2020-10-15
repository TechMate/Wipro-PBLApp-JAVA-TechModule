import java.util.Scanner;
class FExample161
{
	public static void main(String[] args) {
		int n,reverse = 0,remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer to reverse it");
		n =sc.nextInt();
		while(n!=0)
		{
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
        System.out.println("The reverse number:"+reverse);
		
	}
}