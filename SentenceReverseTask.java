import java.util.Scanner;

public class SentenceReverseTask{
	public static void main(String[] arrays){

		Scanner userInput = new Scanner(System.in);
		String sentence = userInput.nextLine();
		String split[] = sentence.split(" ");
		displayReversedString(split);
	}

	public static void displayReversedString(String[] input){
		for(int count = input.length - 1; count >= 0; count--){
		System.out.print(input[count] + " ");
			}

	}
}




