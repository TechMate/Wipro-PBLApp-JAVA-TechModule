import java.util.Scanner;
class AExample9
{
	public static void main(String[] args) {
		int n,i,fin = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(i= 0;i<n;i++)
		{
			arr[i] = sc.nextInt();

		}
		for(i= 0;i<arr.length;i++)
		{
		  if(arr[i] != 10)
		  {
			int temp = arr[i];
			arr[i] = 0;
			arr[fin] = temp;
			fin ++;
		  }
		  else
		  {
		  	arr[i] = 0;
		  }
		}
		System.out.println("The array without the element 10");
		for(i= 0;i<arr.length;i++)
        {
        	        System.out.println(arr[i]+"");

        }
		
	}
}