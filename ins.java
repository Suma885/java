class Main
{
	public static void main(String args[])
	{
	int age=27;
	String health="excellent", livesin="city",gender="male";
	double premium;
	if(age>=25 && age<=35 && health=="excellent" &&  livesin=="city" && gender=="male")
 	{
	premium=(4/1000.0)*200000;
	System.out.println(premium);
	}
	else if (age>=25 && age<=35 && health=="excellent" &&  livesin=="city" && gender=="female")
	{
	premium=(3/1000.0)*100000;
	System.out.println(premium);
	}
	else if (age>=25 && age<=35 && health=="poor" &&  livesin=="village" && gender=="male")
	{
	premium=(6/1000.0)*10000;
	System.out.println(premium);
	}
	else
	{
	System.out.println("person is not insured");
	}
	}
}