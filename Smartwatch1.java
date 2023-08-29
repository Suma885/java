class Smartwatch
{
	public static void main(String args[])
	{
	String productname="smart watch";
 	String color="peach";
	int actualprice=29900;
	int quantity=1;
 	String warranty="1year";
	double special_discount=9;
	special_discount=(special_discount/100)*actualprice;
	double bankoffer=10/100.0*actualprice;
	System.out.println("productname="+productname);
	System.out.println("color="+color);
	System.out.println("actualprice="+actualprice);
	System.out.println("no.of items ordred="+quantity);
	System.out.println("warranty="+warranty);
	System.out.println("special_discount="+special_discount);
	double maxprice=actualprice-special_discount;
	System.out.println("maxprice="+maxprice);
	System.out.println("bankoffer="+bankoffer);
	double totalprice=maxprice-bankoffer;
	System.out.println("totalprice="+totalprice);
	double amount=(price-3000);
	System.out.println("totalamount="+amount);
	
	}
}