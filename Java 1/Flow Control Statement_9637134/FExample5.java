import java.util.Scanner;
class FExample51
{
	public static void main(String[] args) {
		char variable;
		Scanner sc = new Scanner(System.in);
		variable = sc.next().charAt(0);
		if((variable>= 'a' && variable <= 'z')||(variable >= 'A' && variable <= 'Z'))
		{
			System.out.println("Alphabhet");
		}
		else if(Character.isDigit(variable))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Spcial character");
		}
	}
}