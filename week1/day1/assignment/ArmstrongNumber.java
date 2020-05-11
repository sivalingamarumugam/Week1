package week1.day1.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int givenNumber=153;
		int cube = 0;		
		int a,temp;
		temp=givenNumber;
		while(givenNumber>0)
		{
			a = (givenNumber%10);
			cube = cube + (a*a*a);
			givenNumber=givenNumber/10;			
			
			
		}
	   if(temp==cube) 
	   {
		   System.out.println("The given Number is ArmstrongNumber"+"\n"+cube);
	   }
	   else
	   {
		   System.out.println("The given Number is not a ArmstrongNumber"+"\n"+cube);
	   }

	}

}
