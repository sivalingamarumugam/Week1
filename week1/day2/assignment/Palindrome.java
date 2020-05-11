package week1.day2.assignment;

public class Palindrome {
	
	String givenText = "madam";
	

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.usingCharAt();
		obj.usingCharArray();
		
		
	}
	
	public void usingCharArray() {
		String revText="";
		char[] charArray=givenText.toCharArray();
		int len = charArray.length;
		for (int i= len-1;i>=0;i--) 
		{
			char str = charArray[i];
			revText = revText.concat(Character.toString(str));		
		}
		if(givenText.equals(revText)) {
			System.out.println(givenText+": "+"Give text is a Palindrome");
		}
		else
		{
			System.out.println(givenText+": "+"Give text is not a Palindrome");
		}


	}
	
	public void usingCharAt() {
		String revText="";
		for(int i=givenText.length()-1;i>=0;i--)
		{
           	revText = revText + givenText.charAt(i);
			
		}
		if(givenText.equals(revText)) {
			System.out.println(givenText+": "+"Give text is a Palindrome");
		}
		else
		{
			System.out.println(givenText+": "+"Give text is not a Palindrome");
		}


	}
}
