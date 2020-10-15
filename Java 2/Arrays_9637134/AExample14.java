import java.util.Scanner;
class AExample14
{
	public static void main(String[] args) {
		int i,j,max=0,cmd =0;
		Scanner sc = new Scanner(System.in);
		int arrlen = args.length;
		int arr[][] = new int[10][10];
		int arrmax[] = new int[10];

    for(i = 0;i<args.length;i++)
	 {
	 	arrmax[i] = Integer.parseInt(args[cmd]);
	 	cmd++;

	 }
	 for(i=0;i<arr.length;i++)
	 {
	 	if(arrmax[i]>max)
	 	{
	 		max = arrmax[i];
	 	}
	 }
	
		if(arrlen<9 || arrlen > 9)
		{
			System.out.println("Must Enter 9 elements");
		}
	    if(arrlen == 9)
	    {
	    	int input = 0;
	    	for(i=0;i<3;i++)
	    	{
	    		for(j =0;j<3;j++)
	    		{
	    			arr[i][j] = Integer.parseInt(args[input]);
	    			input++;
	    		}
	    	}
	    	System.out.println("The array is:");
			for(i=0;i<3;i++)
	    	{
	    		for(j =0;j<3;j++)
	    		{
	    			    	System.out.print(arr[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	}
	 System.out.println("The biggest number in given array is:"+max);	
	  
	    }

}
