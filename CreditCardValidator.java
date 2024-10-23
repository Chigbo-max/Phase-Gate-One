import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator{
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello, kindly enter card details to verify ");		
		String cardNumbers = userInput.next();
		String[]  splittedCardNumbers = cardNumbers.split("");

		checkCreditCardLength(splittedCardNumbers);
	}

	public static void checkCreditCardLength(String[] numbers){

			if(numbers.length >= 13 && numbers.length <= 16)
			{
			checkPrefix(numbers);
			displayCreditCardNumber(numbers);
			displayCreditCardLength(numbers);
			determineCardValidity(numbers);

			}else{
				System.out.print("Invalid number");
				
			}
	}



	public static String[] checkPrefix(String[] numbers){
		
		
			if (numbers[0].equals("4")){
				System.out.println("Credit Card Type: VisaCard");
			}
			else if(numbers[0].equals("5")){
				System.out.println("Credit Card Type: MasterCard");
			}

			else if(numbers[0].equals("3") && numbers[1].equals("7")){
				System.out.println("Credit Card Type: American Express Card");
			}
			else if(numbers[0].equals("6")){
				System.out.println("Credit Card Type: Discover Card");
			}
			else{
				System.out.println("Credit Card Type: Invalid");
			}

		return numbers;

	}



		public static void displayCreditCardLength(String[] numbers){

			if(numbers.length >= 13 && numbers.length <= 16){
			
				System.out.printf("%n%s %d%n", "Credit Card Digit Length:",numbers.length);
				
			}
		}


		public static void displayCreditCardNumber(String[] numbers){
		
			System.out.print("Credit Card Number: ");
			for(String cardNumbers : numbers){		
				System.out.print(cardNumbers);
			}
		}


		public static void determineCardValidity(String[] numbers){
			
			int[] arrayCardNumbers = new int[numbers.length];
			for(int count = 0; count < numbers.length; count++){
				arrayCardNumbers[count] = Integer.parseInt(numbers[count]);

				}
		

			System.out.print(Arrays.toString(arrayCardNumbers));

		}





		

}