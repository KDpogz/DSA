package Linear;
import java.util.*;
public class LinearSearch {
public static void main(String[]args){
	
int how,find;
int []array;
	Scanner input = new Scanner(System.in);
	Random rad = new Random();
	System.out.println("How many Output: ");
	how= input.nextInt();
	
	array= new int[how];
	
	for (int i=0; i<=how-1;i++){
		array[i]=rad.nextInt(1000);
		System.out.println(array[i]);
	}
	System.out.println("Searching for: ");
	find=input.nextInt();
	for(int j=0;j<=how-1;j++){
		if(find==array[j]){
			System.out.println("Index no: "+ j);
		break;
		}
		if (j==how-1){

			System.out.print("the Number you searched is not in the Given Random!!!");

		}

			}
}
}