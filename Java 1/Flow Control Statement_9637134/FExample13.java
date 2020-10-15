class FExample131
{
    public static void main(String[] args) {
	int start = 10,end=99,i,j,count;
   System.out.println("The prime numbers from 10 to 99 are:");
  for(i=start;i<=end;i++)
  {
    count = 0;
    for(j = 1;j<=i;j++)
    {
       if(i % j == 0)
      {
        count++;
      }
    }

    if(count==2)
    {
      System.out.print(i+" ");
    }
  }

  }

}