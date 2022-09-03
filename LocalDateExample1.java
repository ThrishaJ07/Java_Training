import java.time.LocalDate;
public class LocalDateExample1 {
	public static void main(String[] args){
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tommorrow = yesterday.plusDays(2);
		System.out.println("Todays date "+date);
		System.out.println("Yesterday date "+yesterday);
		System.out.println("Tommorrow date "+tommorrow);	
	}
}
