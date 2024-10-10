public class YearToCenturyConverter{

	public int convertYearToCentury(int year){

	int result = 1 +(year/100);
	
	System.out.println("Year: " + year);

	System.out.println("Century: " + result);
	
	return result;

	}

	public void isNegative(int year){
		if(year <= 0) throw new IllegalArgumentException("invalid input. Year cannot be negative!");
	}

	public void isNonInteger(String year){
		if(year == "abc")throw new IllegalArgumentException("Input must be an integer");

	}

}