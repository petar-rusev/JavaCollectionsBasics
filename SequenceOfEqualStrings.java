import java.util.Scanner;

public class SequenceOfEqualStrings {

	public static void main(String[] args) {
		
		try(Scanner input=new Scanner(System.in)){
			
			String sentence=input.nextLine();
			String[] words= sentence.split(" ");
			System.out.printf("%s",words[0]);
			
			for(int i=1;i<words.length;i++){
				if(words[i].equals(words[i-1])){
					System.out.print(""+words[i]);
					
				}
				else{
					System.out.println();
					System.out.print(words[i]);
				}
			}
		}
	}
}


