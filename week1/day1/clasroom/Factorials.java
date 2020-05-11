package week1.day1.clasroom;

public class Factorials {

	public static void main(String[] args) {
		Factorials myObject = new Factorials();
		myObject.factorialCalculation();
	}
	public void factorialCalculation()
	{
		int input = 5;
		int fact =1 ;
		int i = 1;
		while(i<input)
		{
			fact = fact * i;
			i=i++;
			
			
		}
		
		System.out.println(fact);
	}

}
