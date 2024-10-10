import java.util.Scanner;

public class CenturyDeterminant{
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a year, e.g, 2005: ");

		try{

		int year = userInput.nextInt();

		convertYearToCentury(year);
		}catch(Exception y){System.out.print("Incorrect input, enter a valid number");
		}
	}


	public static int convertYearToCentury(int year){
		
		int result = 0;

		if(year > 0 ){


		result = 1 +(year/100);
	
		System.out.println("Year: " + year);

		System.out.println("Century: " + result);

		}
		else {
			System.out.println("invalid input, year cannot be negative");
			}	
		return result;

	}

}


