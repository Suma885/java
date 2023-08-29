class First
{
	public static void main(String args[])
	{
	String name =" apple iphone14(blue,128GB)";
	double maxprice=79900 ;		

	double off=14;
	double discount=(off/100)*maxprice;
	System.out.println("discount:"+discount);
	maxprice=maxprice-discount;
	System.out.println("maxprice="+maxprice);
	double pack=99;
	maxprice=maxprice+pack;
	double bankoffer=5/100.0*maxprice;
	System.out.println("bankoffer="+bankoffer);
	maxprice=maxprice-bankoffer;
	System.out.println(" final maxprice="+(maxprice-7000));

	}
}
        