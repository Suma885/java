 class Main
{
	public static void main(String args[] )
	{
	String name="suma",grade;
	char sec='a';
	int s1=90,s2=85,s3=80,s4=75,s5=70,s6=65;
	int  scholarship,donation,fee=74000;
	int total=s1+s2+s3+s4+s5+s6;
	double per=total/600*100;
	if(per>80)
	{
	sec='a';
	scholarship=10000;
	donation=0;
	grade="distinction";
	}
	else
	{
	sec='b';
	scholarship=0;
	donation=1500;
	grade="fail";
	}
	 fee=fee+donation-scholarship;
	System.out.println(grade  +  "total fee"  +fee);
	}
}