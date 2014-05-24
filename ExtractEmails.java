import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
			
			
			String text = input.nextLine().toLowerCase();
			Pattern emailPattern = Pattern.compile("[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}");
			Matcher matcher = emailPattern.matcher(text);
			while (matcher.find()) {
			System.out.println(matcher.group());
			}

	}

	}
}
