package week1.day2.assignment;

public class SumOfDigittsFromString {
	String text = "Tes12Le79af65";
	int sum = 0;

	public static void main(String[] args) {
		SumOfDigittsFromString obj = new SumOfDigittsFromString();
		obj.changeToIntandSUM();
		obj.changeToCharray();
		

	}
	public void changeToIntandSUM()
	{
		String str=text.replaceAll("[a-zA-Z]", "");
		System.out.println("String after removed alphabet:"+str);
		/* change to integer */
		int num = Integer.parseInt(str);
		int sum = 0;
		while(num%10>0)
		{
			int remainder = num%10;
			sum = sum + remainder;
			num = num/10;
	
		}
		System.out.println("sum of the dugits: "+sum);
	}
	
	public void changeToCharray()
	{
		String str = text.replaceAll("[a-zA-Z]", "");
		char[] charArray = str.toCharArray();
		for (int i=0;i<=charArray.length-1;i++)
		{
			
			int num = Character.getNumericValue(charArray[i]);
			sum = sum + num ;			
		}
		System.out.println("sum of the dugits: "+sum);
		
		
		
	}

}
