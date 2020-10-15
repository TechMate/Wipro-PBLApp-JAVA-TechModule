import java.util.Scanner;
class FExample141
{
	public static void main(String[] args) {
    int n=6,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numbers");
    n = sc.nextInt();
    for(int i = 0;i<=n;i++)
    {
        sum = sum + i;

		
	}
	System.out.print(sum);
	
    }
}