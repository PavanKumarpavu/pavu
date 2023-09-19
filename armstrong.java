package project1;

public class armstrong {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int rem,sum = 0;
		
		while(n!=0)
		{
			rem = n% 10;
			sum = sum+(rem*rem*rem);
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("given number is armstrong number");
		}
		else
		{
			System.out.println("given number is not a armstrong number");
		}
	}

}
