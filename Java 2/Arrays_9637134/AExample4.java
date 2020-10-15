import java.util.Scanner;
class AExample4
{
	public static void main(String[] args) {
	int n,i;
	String str;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of elements");
	n= sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the elements");
	for(i = 0 ;i<n;i++)
	{
		arr[i] = sc.nextInt();
		
	}
	for(i= 0;i<n;i++)
	{
		str = Character.toString((char)arr[i]);
		System.out.println(str+",");
	}

	}
}