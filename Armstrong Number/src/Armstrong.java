
public class Armstrong {
public double ArmstrongChecker(int n)
{
	double  sum =0;
	while(n!=0)
	{
		int rem = n%10;
		sum = sum + Math.pow(rem, 3);
		
	}
	return sum;

}}
