import java.util.Scanner;

public class SentenceReverseTask{
	public static void main(String[] arrays){

		Scanner userInput = new Scanner(System.in);
		String sentence = userInput.nextLine();
		String reverse[] = new String[sentence];
		displayReversedString(sentence);
	}

	public static void displayReversedString(String input){
		char character = input.charAt(0);
		String reverse = " ";

		for(int count = 0; count < input.length(); count++){
			reverse = reverse(input);
;
		}
		System.out.print(reverse);

			}

}


