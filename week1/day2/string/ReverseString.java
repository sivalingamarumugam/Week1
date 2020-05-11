package week1.day2.string;

public class ReverseString {

	
	
	public static void main(String[] args) {
		
		ReverseString reverseString = new ReverseString();
		reverseString.usingCharArray("feeling good" );
		reverseString.usingIndex("feeling good");
	}
	public void usingCharArray(String str)
	{
		char[] charArray = str.toCharArray();
		for(int i=charArray.length-1 ; i >= 0; i--)
		{
			char str1 = charArray[i];
			String str2 = String.valueOf(str1);
//			System.out.print(charArray[i]);
			System.out.print(str2);
		}
		System.out.println("\n");
		
	}
	public void usingIndex(String str)
	{
		int lenOfString = str.length();
		for(int i=lenOfString-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
