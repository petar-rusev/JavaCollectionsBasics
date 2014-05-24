import java.util.Scanner;


public class CountSubstringOccurrences {

	public static void main(String[] args) {
		
		try(Scanner input=new Scanner(System.in)){
			
			String text=input.nextLine();
			String sub=input.next();
			String [] words=text.split("\\W+");
			int counter=0;
			for(int i=0;i<words.length;i++){
				if(words[i].toLowerCase().contains(sub.toLowerCase())){
					counter++;
				}
				
			}
			System.out.printf("%s - %s times",sub,counter);
		}

	}

}
