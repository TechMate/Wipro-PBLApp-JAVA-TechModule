import java.util.Scanner;
class AExample10
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

		int leftindex = 0 , rightindex = arr.length-1;
		while(leftindex < rightindex)
		{
            while(arr[leftindex] % 2 == 0 && leftindex < rightindex)
            	leftindex ++;
            
            while(arr[rightindex]%2 == 1 && leftindex <rightindex)
            	rightindex--;

            if(leftindex < rightindex)
            {
            	int temp = arr[leftindex];
            	arr[leftindex] = arr[rightindex];
            	arr[rightindex] = temp;
            	leftindex++;
            	rightindex--;
           

            }
		}
		System.out.println("The after segergating even to left side and odd on right side:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}