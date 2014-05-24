import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Please enter an integer number n");
		
		try(Scanner input=new Scanner(System.in)){
			int n=input.nextInt();
			int Number[]=new int [n];
			for(int i=0;i<n;i++){
				Number[i]=input.nextInt();
			}
			Arrays.sort(Number);
			for(int i=0;i<Number.length;i++){
				System.out.printf("%s ",Number[i]);
			}
			
		}
	}

}
