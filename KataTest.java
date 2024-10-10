import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;




public class KataTest{

	@Test
	public void testConvertYearToCentury(){
	
	int year = 2005;	
	
	YearToCenturyConverter yearToCenturyConverter = new YearToCenturyConverter();

	int yearToCentury = yearToCenturyConverter.convertYearToCentury(year);

	int expected = 21;

	assertEquals(expected, yearToCentury);

	}

	@Test
	public void testNegativeYearThrowsException(){
	
	int year = -1;

	YearToCenturyConverter yearToCenturyConverter = new YearToCenturyConverter();
	
	assertThrows(IllegalArgumentException.class,()->yearToCenturyConverter.isNegative(year));
	}
	
	@Test
	public void testNonIntegerYearThrowsException(){

	String year = "abc";

	YearToCenturyConverter yearToCenturyConverter = new YearToCenturyConverter();

	assertThrows(IllegalArgumentException.class,()->yearToCenturyConverter.isNonInteger(year));
		
	}



}


