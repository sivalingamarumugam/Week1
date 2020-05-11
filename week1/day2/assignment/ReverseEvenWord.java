package week1.day2.assignment;

import java.util.Arrays;

public class ReverseEvenWord {
	public static void main(String[] args) {
		String reverse = "";
		String text_1 = "I am a software tester";
		String[] text_2 = text_1.split("\\s");
		System.out.println(Arrays.toString(text_2));
		for(int i = 0; i < text_2.length;i++)
		{
			if((i+1)%2==0)
			{				
				char[] charArray=text_2[i].toCharArray();
				for (int j=charArray.length-1;j>=0;j--)
				{
					reverse = reverse + charArray[j];
				}			
			}
			else 
			{
				reverse = reverse + text_2[i];
			}					
			reverse = reverse + " ";	
			  
		}
		System.out.println("output of reverse the even word: "+reverse);		

	}

}
