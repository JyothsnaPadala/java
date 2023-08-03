
public class Reverse {
public int ReverseNumber(int n)
{
	int rev =0;
	while(n!=0)
	{
	int rem = n%10;
	n=n/10;
	rev = rev*10+rem;
	
	}
	return rev;
}
}
