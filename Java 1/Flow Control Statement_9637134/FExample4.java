import java.util.Scanner;
class FExample41
{
	public static void main(String[] args) {
		char a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Character");
        a = sc.next().charAt(0);
        System.out.println("Enter the second Character");
        b = sc.next().charAt(0);
        if(a<b)
        {
        	System.out.println(a+","+b);
        }
        else
        {
        	System.out.println(b+","+a);
        }

	}
}