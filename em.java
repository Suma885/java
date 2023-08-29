class Main
{
	public static void main(String args[] )
	{
	String name="suma";
	double basicsalary=25000;
	double ta=15,da=12,hra=19,gross,pf,tax;
	ta=15/100*basicsalary;
	da=12/100*basicsalary;
	hra=19/100*basicsalary;
	double total=basicsalary+ta+da+hra;
	if(total>40000)
	{
	pf=11/100*basicsalary;
	tax=15/100*basicsalary;
	}
	else
	{
	pf=7/100*basicsalary;
	tax=25/100*basicsalary;
	}
	 gross=total-pf-tax;
	System.out.println(gross);
	}
}