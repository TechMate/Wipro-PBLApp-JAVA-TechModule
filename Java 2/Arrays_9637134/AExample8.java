import java.util.Scanner;
class AExample8
{
	public static void main(String[] args) {
		int n,r=0,sum=0,i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of elements");
		n = sc.nextInt();
		int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(i =0;i<n;i++)
        {
          arr[i] =  sc.nextInt();
        }
        for(i=0;i<arr.length-1;i++)
        {
        	if(arr[i] == 6)
        	{
        		for(int j = arr.length-1;j>=0;j--)
        		{
        			if(arr[j] == 7)
        				break;
        			r=r+arr[j];
        		}
        		break;
             
        	}
        	sum = sum + arr[i];
        }
        System.out.println(r+sum);
    }
}