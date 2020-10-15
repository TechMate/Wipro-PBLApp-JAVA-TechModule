import java.util.Scanner;
class AExample5
{
	public static void main(String[] args) {
	 int n,i,max=0,max2=0;
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
	  for(i=0;i<arr.length;i++)
	 {
	 	if(arr[i] < max && arr[i]>max2)
	 	{
	 		max2 = arr[i];
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
	 int min2 = arr[0];
	 for(i=0;i<arr.length;i++)
	 {
	 	if(arr[i]>min && arr[i] < min2)
	 	{
	 		min2 = arr[i];
	 	}
	 }
System.out.println("The First maximun is:"+max);
System.out.println("The Second maximum element is:"+max2);
System.out.println("The First minimum element is:"+min);
System.out.println("The Second minimum element is:"+min2);
		
	}
}