class AExample13
{
	public static void main(String[] args) {
		int i;
		int arrlen = args.length;
		int arr[][] = new int[4][4];
		if(arrlen<4 || arrlen > 4)
		{
			System.out.println("Must Enter 4 elements");
		}
		if(arrlen==4)
		{
			int input = 0;
			for(i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					arr[i][j] = Integer.parseInt(args[input]);
					input++;
				}
			}
			System.out.println("The array is:");
			for( i = 0;i<2;i++)
			{
				for(int j= 0;j<2;j++)
				{
				  System.out.print(arr[i][j]+" ");
		     	}
		     	System.out.println(" ");
		   }
			
		System.out.println("The reverse of array is:");
		for(i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
			   System.out.print(arr[i][j]+" ");
			}
            System.out.println(" ");
		}
	}	
}}
