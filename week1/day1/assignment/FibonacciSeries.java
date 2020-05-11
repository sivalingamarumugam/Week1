package week1.day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firstNum=0,secondNum=1,thirdNum;
		for(int i=1;i<=range;i++) {
			System.out.println(firstNum);
			thirdNum=firstNum +secondNum;			
			firstNum = secondNum;
			secondNum = thirdNum;
			
			
			
		}
		
	}

}
