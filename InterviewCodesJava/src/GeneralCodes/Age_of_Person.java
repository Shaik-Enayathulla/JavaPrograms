package GeneralCodes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Age_of_Person {

	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(1999, 8, 3);
		LocalDate Today = LocalDate.now();
		System.out.println("Your Present Age is: "+ChronoUnit.YEARS.between(birthDay, Today));

	}

}
