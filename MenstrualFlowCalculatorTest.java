import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;



public class MenstrualFlowCalculatorTest{



@Test
public void testThatGetFirstFlowDateFunctionReturnsCorrectDate(){

String firstFlowDate = MenstrualFlowCalculator.getFirstFlowDate();

String expected = "2024-08-02";

assertEquals(firstFlowDate, expected);

}


@Test
public void testThatGetNextFlowDateFunctionReturnsCorrectDate(){

LocalDate firstFlowDate = "2024-08-01";
int averageCycle = 28;
LocalDate nextFlowDate = MenstrualFlowCalculator.getNextFlowDate(firstFlowDate, averageCycle);
LocalDate expected = "2024-08-29";
assertEquals(nextFlowDate, expected);

}


@Test
public void testThatGetOvulationDateFunctionReturnsCorrectDate(){

LocalDate lastDay = "1-08-2024";
LocalDate ovulationDate = MenstrualFlowCalculator.getOvulationDate(lastDay);

LocalDate expected = "15-08-2024";

assertEquals(ovulationDate, expected);

}


@Test
public void testThatGetHealingPeriodFunctionReturnsCorrectDate(){

LocalDate firstFlowDate = "2-08-2024";


LocalDate healingDate = MenstrualFlowCalculator.getHealingPeriod(firstFlowDate);

LocalDate expected = "07-08-2024";

assertEquals(healingDate, expected);


}

@Test
public void testThatGetSafePeriodFunctionReturnsCorrectDate(){

LocalDate firstFlowDate = "2-08-2024";

int averageCycle = 28;

int average = averageCycle/4;

int result = averageCycle - average;

LocalDate safePeriodResult = firstFlowDate.plusDays(result);

LocalDate safePeriod = MenstrualFlowCalculator.getSafePeriod(safePeriodResult,averageCycle);

LocalDate expected = "07-08-2024";

assertEquals(safePeriod, expected);


}




}