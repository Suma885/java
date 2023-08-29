class Main
{
	public static void main(String args[])
	{
	String name="smartwatch";
	String color="peach";
	double price=3000;
	double discount=10;
	double dis,b=5,ba;
	double quantity=2;
	double total=quantity*price;
	System.out.println(total);
	if(quantity<=10)
	{
	dis=discount/100*price;

	System.out.println("if:"+dis);
	}
	else 
	{
	ba=(b/100)*price;
	System.out.println("else:"+ba);
	}
	}
}
