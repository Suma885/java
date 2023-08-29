class Main
{
	public static void main(String args[])
	{
	int costprice=1200;
	int sellingprice=400;
	if(costprice<sellingprice)
	{
	int profit=sellingprice-costprice;
	System.out.println("profit"+profit);
	}
	else
	{
	int loss=costprice-sellingprice;
	System.out.println("loss"+loss);
	}
	}
}
	