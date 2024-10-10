import java.util.Scanner;

public class DuplicateCharacters{
	public static void main(String... args){

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a word: ");

		String word = userInput.nextLine();

		char[] characters = word.toCharArray();

		System.out.print(displayBoolean(characters));
		}

	public static boolean displayBoolean(char[] array){
					int count = 0;

		if(array.length % 2 == 0){

		for(int index = 0; index < array.length; index++){
			for(int check = index + 1; check < array.length; check++){
				if (array[index] == array[check]) count++;
				if(count == 2) return true;

				}
			}

		} else {
			return false;
		}

	return false;

	}

}








