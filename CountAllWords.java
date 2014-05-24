import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
	
		try(Scanner input=new Scanner(System.in)){
			
			String text=input.nextLine();
			//text.replaceAll("[^a-zA-Z0-9\\s]", "");
			String [] words=text.split("\\W+");
			int counter=0;
			for(int i=0;i<words.length;i++){
				
				counter++;
			}
			System.out.printf("%s\n",counter);
		}

	}

}
