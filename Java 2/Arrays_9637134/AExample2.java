import java.util.Scanner;
class AExample2
{
	public static void main(String[] args) {
	 int n,i,max=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the no of element");
	 n = sc.nextInt();
	 int arr[] = new int[n];
	 System.out.println("Enter the elements");
	 for(i = 0;i<n;i++)
	 {
	 	arr[i] = sc.nextInt();

	 }
	 for(i=0;i<arr.length;i++)
	 {
	 	if(arr[i]>max)
	 	{
	 		max = arr[i];
	 	}
	 }
	 
	 int min = arr[0];
	 for(i=0;i<arr.length;i++)
	 {
	 	if(arr[i]<min)
	 	{
	 		min = arr[i];
	 	}
	 }
System.out.println("The maximum element is:"+max);
System.out.println("The minimum element is:"+min);
		
	}
}