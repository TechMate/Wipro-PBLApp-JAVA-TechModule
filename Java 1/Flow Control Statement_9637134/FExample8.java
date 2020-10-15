import java.util.Scanner;
class FExample81
{
	public static void main(String[] args) {
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("The following colour code  are :");
		System.out.println("R,B,G,O,Y,W");
		ch = sc.nextLine();
		switch(ch)
		{
			case "R":
			System.out.println("Red");
			break;

			case "B":
			System.out.println("Blue");
			break;

			case "G":
			System.out.println("Green");
			break;

			case "O":
			System.out.println("Orange");
			break;

			case "Y":
			System.out.println("Yellow");
			break;

			case "W":
			System.out.println("White");
			break;

			default:
			System.out.println("Invalid choice");

		}
	}
}