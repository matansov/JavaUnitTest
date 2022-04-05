package moduleTestJava;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PaymentSystemTest {

	@Test
	void CalculateFuturePaymentDate_ValidInput_DateReturned30DaysInFuture() {
		
		PaymentDates pd = new PaymentDates();
		LocalDate sampleDate = LocalDate.of(2011, 7, 6);
		
		LocalDate resultDateWhichShouldBe30DaysLater = pd.CalculateFuturePaymentDate(sampleDate);
		assertEquals(sampleDate.plusDays(30), resultDateWhichShouldBe30DaysLater);
	}
	
	@Test
	void CalculateFuturePaymentDate_InputCausesSundayDate_DateReturnedIsMonday() {
		
		PaymentDates pd = new PaymentDates();
		LocalDate sampleDate = LocalDate.of(2011, 7, 8);
		
		LocalDate resultDateWhichShouldBeMonday = pd.CalculateFuturePaymentDate(sampleDate);
		assertEquals(java.time.DayOfWeek.MONDAY, resultDateWhichShouldBeMonday.getDayOfWeek());
	}


}
