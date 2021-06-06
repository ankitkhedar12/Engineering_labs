class palindrome
{
	public static void main(String args[])
	{
		int r,sum=0,t;
		int p=12321;
		t = p;
		while(p>0)
		{
			r = p%10;
			sum=(sum*10)+r;
			p=p/10;
		}
		if(t == sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}