import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month and year in '(M)M YYYY' format to find the number of days that were in that month: ");
        int month = input.nextInt();
        int year = input.nextInt();
        int numberDaysMonth = 0;
        String monthName = "uhhh";

        switch (month) {
            case 1:
                monthName = "January";
                numberDaysMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year == 1960) || (year == 1964) || (year == 1968) || (year == 1972) || (year == 1976) || (year == 1980) || (year == 1984) || (year == 1988) || (year == 1992)
                    || (year == 1996) || (year == 2000) || (year == 2004) || (year == 2008) || (year == 2012) || (year == 2016) || (year == 2020) || (year == 2024) || (year == 2028) || (year == 2032)
                    || (year == 2036) || (year == 2040) || (year == 2044) || (year == 2048) || (year == 2052) || (year == 2056) || (year == 2060) || (year == 2064)) {
                        numberDaysMonth = 29;
                } else {
                        numberDaysMonth = 28;
                }
                break;
            case 3:
                monthName = "March";
                numberDaysMonth = 31;
                break;
            case 4:
                monthName = "April";
                numberDaysMonth = 30;
                break;
            case 5:
                monthName = "May";
                numberDaysMonth = 31;
                break;
            case 6:
                monthName = "June";
                numberDaysMonth = 30;
                break;
            case 7:
                monthName = "July";
                numberDaysMonth = 31;
                break;
            case 8:
                monthName = "August";
                numberDaysMonth = 31;
                break;
            case 9:
                monthName = "September";
                numberDaysMonth = 30;
                break;
            case 10:
                monthName = "October";
                numberDaysMonth = 31;
                break;
            case 11:
                monthName = "November";
                numberDaysMonth = 30;
                break;
            case 12:
                monthName = "December";
                numberDaysMonth = 31;
                break;
        }

        System.out.print(monthName + " " + year + " had " + numberDaysMonth + " days.");

        // System.out.print(month + " " + year);
    }
}
