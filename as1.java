class Main
{
	public static void main(String args[])
	{
 	char c='a';
	int s= (char)(c);
	if(s>=65 && s<=90)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
		System.out.println("vowels");
		}
		else 
		{
		System.out.println("consonant");
		}
	}
	else if(s>=97 && s<=122)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
		System.out.println("vowels");
		}
		else 
		{
		System.out.println("consonant");
		}
	}
	}
}