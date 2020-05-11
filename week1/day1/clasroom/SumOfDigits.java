package week1.day1.clasroom;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int givenNumber = 123;
		int sum = 0;
		while(givenNumber>0) {
			sum = sum + (givenNumber%10);
			givenNumber = givenNumber / 10;
			
		}
        System.out.println("sum of the give digit"+"\n"+sum);
	}

}
