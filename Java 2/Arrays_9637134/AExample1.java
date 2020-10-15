import java.util.Scanner;
class AExample1

{
	public static void main(String[] args) {
		int number,sum = 0,i;
		float avg;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of elements");
		number = sc.nextInt();
		int arr[] = new int[number];
        System.out.println("Enter the elements");
        for(i =0;i<number;i++)
        {
          arr[i] =  sc.nextInt();
          sum = sum + arr[i];
         }
         System.out.println("The sum is:"+sum);
         avg = sum/number;
         System.out.print("The average is:"+avg);


        }

	}
