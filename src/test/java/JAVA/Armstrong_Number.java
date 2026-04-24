package JAVA;

public class Armstrong_Number {

	public static void main(String[] args) 
	{
		int n1=1634, n2=n1;
		int copy=n2, count=0;
		int sum=0;
		while(n1!=0)
		{
			count++;
			n1=n1/10;
		}
		while(n2!=0)
		{
			int rem=n2%10;
			int pow = (int)(Math.pow(rem,count));
			sum=sum+pow;
			n2=n2/10;
			
		}
		if (copy==sum) {
			System.out.println("Armstrong Number");
			
		} 
		else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
