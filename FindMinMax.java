package jrandom;

public class FindMinMax {

	public static void main(String[]args){
		int[] number = {88,33,55,23,64,23};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i<number.length;i++){
			if(number[i]<min){
				min = number[i];
			}
		if(number[i]>max){
			max = number[i];
		}
		}
		
		System.out.println("Smallest Number is "+ min);
		System.out.println("The Highest Number is "+ max);
	}
}
