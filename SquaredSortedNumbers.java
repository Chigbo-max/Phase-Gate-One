

import java.util.Scanner;
import java.util.Arrays;

public class SquaredSortedNumbers{
	
	public static int[] getUserInput(){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Enter number of elements: ");
	int numberOfElements = userInput.nextInt();

	int[] numbers = new int[numberOfElements];
	for(int index = 0; index < numbers.length; index++){
		System.out.print("Enter numbers: ");
		numbers[index] = userInput.nextInt();

		}
return numbers;

	}


	public static int[] displaySquaredNumbers(int[] input){
	
	
	for(int index = 0; index < input.length; index++){
		input[index] = input[index] * input[index];
		}
	
	return input;


	}


public static int[] displaySortedNumbers(int[] input){

	for(int count = 0; count < input.length; count++){
		for(int index = 0; index < input.length; index++){

		if (input[index] > input[index + 1]){

			input[index] = input[index] + input[index + 1];
			input[index + 1] = input[index] - input[index + 1];
			input[index] = input[index] - input[index + 1];
			}
		}
	
		}
return input;
	
}



public static void main(String[] args){

int[] userInput = getUserInput();
	
System.out.print(Arrays.toString(userInput));
System.out.print(Arrays.toString(displaySquaredNumbers(userInput)));


int[] sortedNumbers = (displaySortedNumbers(userInput));
System.out.print(Arrays.toString(sortedNumbers));
}

}





