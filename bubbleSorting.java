package bubbleSort;

import java.util.*;

class bubbleSorting {

	public static void main(String[] args) {

		int arraj[], ArrajSize, i, j, temp;

		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();

		System.out.println();
		System.out.print("ArrajSize of an array: ");
	
		ArrajSize = input.nextInt();
		
		arraj = new int[ArrajSize];

		
		System.out.println();
		System.out.println(" random numbers.");

		for (i = 0; i < ArrajSize; i++) {
			
			arraj[i] = rand.nextInt(1000);
		
			System.out.print(arraj[i] + " ");
		
		}

		System.out.println();
		
		for (i = 0; i < ArrajSize-1; i++) { 
		
		for (j = 0; j < ArrajSize-i-1; j++) { 
				
				if (arraj[j] > arraj[j+1]) { 
					
					temp = arraj[j]; 
					
					arraj[j] = arraj[j+1]; 
					
					arraj[j+1] = temp; 
										}
			}
		}

		System.out.println();

		System.out.println("Sorted Numbers!");
		
		for (i = 0; i < ArrajSize; i++) {
			System.out.print(arraj[i] + " ");
		}
		System.out.println();
	}


}

