import java.util.ArrayList;
import java.util.Scanner;


public class CombineListOfLetters {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
			ArrayList<Character> arrFL = new ArrayList<Character>();
			ArrayList<Character> arrSL = new ArrayList<Character>();
			ArrayList<Character> arrPrint = new ArrayList<Character>();

			for (char ch : input.nextLine().toCharArray()) {
			arrFL.add(ch);
			}
			for (char ch : input.nextLine().toCharArray()) {
			arrSL.add(ch);
			}
			arrPrint.addAll(arrFL);

			for (int i = 0; i < arrSL.size(); i++) {
			if (arrFL.contains(arrSL.get(i))) {
			continue;
			} else {
			arrPrint.add(' ');
			arrPrint.add(arrSL.get(i));
			}
			}

			for (int i = 0; i < arrPrint.size(); i++) {
			System.out.print(arrPrint.get(i));
			}
		}
	}

}
