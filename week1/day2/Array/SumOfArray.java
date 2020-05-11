package week1.day2.Array;

public class SumOfArray {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,6};
		double sum = 0;
		
		for(int i=0;i<myArray.length;i++)
		{
			sum = sum+myArray[i];
		}
		double average = sum /(myArray.length);
		System.out.println(sum);
		
		System.out.println(average);

	}

}
