import java.util.Scanner;


public class LargestSequenceOfEqualString {

	public static void main(String[] args) {
		
	try(Scanner input=new Scanner(System.in)){
				
		String sentence = input.nextLine();
		String[] arraySentence = sentence.split(" ");
		int counterTemp = 1;
		int counter = 1;
		int positionOfWord = 0; 

		for (int i = 1; i < arraySentence.length; i++) {
		if (arraySentence[i].equals(arraySentence[i - 1])) {
		counterTemp++;
		} 
		else {
		counterTemp = 1;
		}
		if (counterTemp > counter) {
		counter = counterTemp;
		positionOfWord = i;
		}
		}
		for (int j = 0; j < counter - 1; j++) {
		System.out.print(arraySentence[positionOfWord] + " ");
		}
		System.out.println(arraySentence[positionOfWord]);
		}
	}
}

