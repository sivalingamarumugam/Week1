package week1.day2.assignment;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args)
	{
		String test = "changeme";
		char[] charArray=test.toCharArray();
		String changeText ="";
		for (int i=0 ; i<=charArray.length-1;i++)
		{
			if((i+1)%2==0)
			{
				
//				System.out.print(charArray[i]);
				changeText = changeText.concat(Character.toString(charArray[i]));
				
			}
			else
			{
				changeText = changeText.concat(Character.toString(charArray[i]).toUpperCase());
				
//				System.out.print(Character.toUpperCase(charArray[i]));
			}
				
		}
		System.out.println(changeText);
	}

}
