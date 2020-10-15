import java.util.Scanner;
class AExample7
{
	public static void main(String[] args) {
		int n,i,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element");
		n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[arr.length];
		System.out.println("Enter the elements");
		for(i= 0;i<n;i++)
		{
			arr[i] = sc.nextInt();

		}
		for(i =0;i<arr.length-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}

		temp[j++] = arr[arr.length-1];
		System.out.println("THe array after removing the duplicates:");
		for(int k = 0;k<j;k++)
		{
			System.out.println(temp[k]);

		}
	}
}