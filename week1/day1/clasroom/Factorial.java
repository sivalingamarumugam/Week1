package week1.day1.clasroom;

public class Factorial {
	
	public static void main(String[] args)
	{
		int input = 5;
		int fact =1 ;
		int i = 1;
		while(i<input)
		{
			fact = fact * i;
			i++;
			
			
		}
		
		System.out.println(fact);
	}

}
