package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 2 ;
		boolean flag;
		int m = input/2;
		for(int i=1;i<=m;i++) {
			if(input % i ==0)  {
				flag = true;
				break;
			}
		}
		
		if(flag=true)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}

	}

}
