// STUDENT NAME:
// DATE: 

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/

		/***** INITIALIZATION SECTION *****/
		int todaysDateMonth = 2;
        int todaysDateDay = 2;
        int todaysDateYear = 2020;
        int birthdayMonth = 8;
        int birthdayDay = 26;
        int birthdayYear = 1918;

		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
        int aForToday = (14 - todaysDateMonth) / 12;
        int yForToday = todaysDateYear + 4800 - aForToday;
        int mForToday = todaysDateMonth + (12 * aForToday) - 3;
        int jdnForToday = todaysDateDay + ((153 * mForToday + 2) / 5) + (365 * yForToday) + (yForToday / 4) - (yForToday / 100) + (yForToday / 400) - 32045;

        int aForBirthday = (14 - birthdayMonth) / 12;
        int yForBirthday = birthdayYear + 4800 - aForBirthday;
        int mForBirthday = birthdayMonth + (12 * aForBirthday) - 3;
        int jdnForBirthday = birthdayDay + ((153 * mForBirthday + 2) / 5) + (365 * yForBirthday) + (yForBirthday / 4) - (yForBirthday / 100) + (yForBirthday / 400) - 32045;
        int differenceInDays = jdnForToday  - jdnForBirthday;
        int numberofYears = differenceInDays / 365;
		/***** OUTPUT SECTION *****/
        System.out.println("Julian Day Number for today's date, " + todaysDateMonth + "/" + todaysDateDay + "/" + todaysDateYear + ", is " + jdnForToday);
        System.out.println("Julian Day Number for birthday, " + birthdayMonth + "/" + birthdayDay + "/" + birthdayYear + ", is " + jdnForBirthday);
        System.out.println("The difference in days is " + differenceInDays + ", which makes you approximately " + numberofYears + " years old!");
  }
}