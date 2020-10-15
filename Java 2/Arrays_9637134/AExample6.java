import java.util.Scanner;
import java.util.Arrays;
class AExample6
{
	public static void main(String[] args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(i= 0;i<n;i++)
		{
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		System.out.println("The sorted array elments are:");
		for(i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}