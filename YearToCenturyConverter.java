import java.util.Scanner;

public class YearToCenturyConverter{

	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		int year = userInput.nextInt();
		convertYearToCentury(year);
		isNegative(year);

		String stringYear = userInput.nextLine();
		isNonInteger(stringYear);
		
		


	}

	public static int convertYearToCentury(int year){

	int result = 1 +(year/100);
	
	System.out.println("Year: " + year);

	System.out.println("Century: " + result);
	
	return result;

	}

	public static void isNegative(int year){
		if(year <= 0)throw new IllegalArgumentException("invalid input. Year cannot be negative!");
	}


	public static void isNonInteger(String year){
	
	if(year == "abc")throw new IllegalArgumentException("Input must be an integer");

	}

}