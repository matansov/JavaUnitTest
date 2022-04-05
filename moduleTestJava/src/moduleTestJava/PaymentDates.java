package moduleTestJava;

import java.time.LocalDate;

public class PaymentDates {
	public LocalDate CalculateFuturePaymentDate(LocalDate startingDate)
	{
		var tempDate = startingDate.plusDays(30);
		
		switch(tempDate.getDayOfWeek())
		{
		case SATURDAY:
			tempDate = tempDate.plusDays(2);
		case SUNDAY:
			tempDate = tempDate.plusDays(1);
			
		}
		return tempDate;
	}
}
