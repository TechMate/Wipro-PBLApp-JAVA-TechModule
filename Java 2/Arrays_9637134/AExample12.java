import java.util.Scanner;
class AExample12
{
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		int arr3[] = new int[2];
		System.out.println("Enter the elements of array 1");
		for(i=0;i<arr1.length;i++)
		{
            arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of array 2");
		for(i=0;i<arr2.length;i++)
		{
            arr2[i] = sc.nextInt();
		}
		System.out.print("The array1 elements are:"+" ");
        for(i=0;i<arr1.length;i++)
        {
        	System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("The array2 elements are:"+" ");
        for(i=0;i<arr2.length;i++)
        {
        	System.out.print(arr2[i]+" ");
        }
        System.out.println();
        arr3[0] = arr1[1];
        arr3[1] = arr2[1];
        System.out.println("The middleway array is:");
         
        for(i=0;i<arr3.length;i++)
        {
        	System.out.print(arr3[i]+" ");
        }




	}
}