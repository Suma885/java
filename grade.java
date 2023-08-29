class Main
{
	public static void main(String args[])
	{
	int hardeness=50;
	double carbon=0.7;
	int tensilestrength=5600;
	if(hardeness>=50 && carbon<=0.7 && tensilestrength>=5600)
	{
	System.out.println("grade 10");
	}
	else if(hardeness>=50 && carbon<=0.7)
	{
	System.out.println("grade 9");
	}
	else if(carbon<=0.7 && tensilestrength>=5600)
	{
	System.out.println("grade 8");
	}
	else if(hardeness>=50 && tensilestrength>=5600)
	{
	System.out.println("grade 7");
	}
	else if(hardeness>=50 || carbon<=0.7 || tensilestrength>=5600)
	{
	System.out.println("grade 6");
	}
	else
	{
	System.out.println("grade 5");
	}
	}
}
