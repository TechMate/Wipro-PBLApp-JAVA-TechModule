import java.util.Scanner;
class AExample3
{
	public static void main(String[] args) {
     int n,search,flag=0,i=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the no of element");
	 n = sc.nextInt();
	 int arr[] = new int[n];
	 System.out.println("Enter the elements");
	 for(i = 0;i<n;i++)
	 {
	 	arr[i] = sc.nextInt();

	 }
	 System.out.println("Enter the serach element");
     search = sc.nextInt();
     for(i = 0;i<n;i++)
     {
     	if(arr[i] == search)
     	{
     		flag = 1;
     		break;
     	}
     	else
     	{
     		flag = 0;
     	}
     }
     if(flag == 1)
     {
     	System.out.println("The position of element is"+(i+1));
     }
     else
     {
     	System.out.println("-1");
     }
	}
}