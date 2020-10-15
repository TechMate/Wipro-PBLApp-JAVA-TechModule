import java.util.Scanner;
import java.util.Arrays;
class AExample11
{
	public static void main(String[] args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<arr.length;i++)
		{
            arr[i] = sc.nextInt();
		}
		System.out.println("The given array is:");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
                boolean test = false;
		for(i= 0 ;i<arr.length;i++)
		{
			if(arr[i] == 1 || arr[i] == 4)
			{
				test = true;
                                break;
			}
			
		}
                System.out.println(test);
}
}