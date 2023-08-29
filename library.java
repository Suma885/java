class Main
{
	public static void main(String args[])
	{
	int days=3l4;
	if(days<=5)
	{
	System.out.println("0.5 rp");
	}
	else if (days>=6 && days<=10)
	{
	System.out.println("1 rp");
	}
	else if(days<=29)
	{
	System.out.println("5 rp");
	}
	else if(days>=30)
	{
	System.out.println("membership will be cancelled");	
	}
	}
}