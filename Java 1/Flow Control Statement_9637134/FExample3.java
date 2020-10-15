class FExample31
{
	public static void main(String args[])
	{
		int l = args.length;
		if(l == 0)
		{
			System.out.println("No value");

		}
		else
		{
			System.out.print(args[0]);
			for(int i=1;i<l;i++)
			{
				System.out.print(","+args[i]);
			}

		}
	}
}