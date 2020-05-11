package week1.day2.string;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();
		for (int i =0; i < charArray.length-1 ; i++) 
		{
			  
              if(charArray[i] == 'e')
              {
            	  count=count+1 ;
              }
            	  
              
            	  
            	  
		}
		System.out.println(count);
	}

}
