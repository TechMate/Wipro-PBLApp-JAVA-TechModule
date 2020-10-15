class FExample61
{
	public static void main(String[] args) {
      String gender;
      int age;
      gender = args[0];
      System.out.println(gender);
      age = Integer.parseInt(args[1]);

		if((gender.equals("Female")||gender.equals("female")) && (age >= 1 || age <= 58 ))
		{
               System.out.println("The percentage of interest is 8.2%");
		}
		else if ((gender.equals("Female")||gender.equals("female")) && (age >= 59 || age <= 100 ))
		{
			System.out.println("The percentage of interest is 9.2%");
		}
		else if ((gender.equals("Male")||gender.equals("male")) && (age >= 1 || age <= 58 ))
		{
			System.out.println("The percentage of interest is 8.4%");
		}
		else if ((gender.equals("Male")||gender.equals("male")) && (age >= 59 || age <= 100 ))
		{
			System.out.println("The percentage of interest is 10.5%");
		}
	}
}