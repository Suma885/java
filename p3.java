class Main
{
	public static void main(String args[])
	{
	int n=17,x=3,y=5;
	if(n%x==0)
	{
		if(n%y==0)
		{
		System.out.println("fizzbuzz");
		}
	}
	else if(n%x==0)
	{
	System.out.println("fizz");
	}
	else if(n%y==0)
	{
	System.out.println("buzz");
	}
	else
	{
	System.out.println(n);
	}
	}
}