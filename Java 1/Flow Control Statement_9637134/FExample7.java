import java.util.Scanner;
class FExample71
{
	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:\t");
		a = sc.next().charAt(0);
		if(Character.isUpperCase(a))
		{
			System.out.println(Character.toLowerCase(a));

		} 
		else
		{
			System.out.println(Character.toUpperCase(a));
		}

	}
}