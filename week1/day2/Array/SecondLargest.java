package week1.day2.Array;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
		
		

	}

}
