package BinarySeach;
import java. util.*;
public class BinarySearch {
	
	int array[];
	int how;
	
	Scanner input = new Scanner(System.in);
	Random rad =  new Random();
	
	public void radcount(){
		
		System.out.println("How many Numbers?");
		how = input.nextInt();
				array= new int[how];
				
			for(int i=0; i<=how-1;i++){
				array[i]= rad.nextInt(1000);
				System.out.println(array[i]);
				}
		
	}
	
	public void searching(){

		int find,counter=0;
		
		System.out.println("Searching for: ");
		find= input.nextInt();
		
		int term=0;
		int first=0,last=how-1;
		int mid = (last+first)/2;
		
		while(term!=1){
			
			if(counter==how-1){
				System.out.println("Item Not Found!!!");
				term++;
			
			}
	counter++;
		for(int j=first;j<=mid+1;j++){
			if(array[j]==find){
				System.out.println("Index no.: "+j);
			term++;
			break;}
	
		}
		
		first=mid;
		mid = (last+first)/2;
		
		
	}
}
	
	
	public static void main(String[]args){
		BinarySearch object = new BinarySearch();
		object.radcount();
		object.searching();
		}
}