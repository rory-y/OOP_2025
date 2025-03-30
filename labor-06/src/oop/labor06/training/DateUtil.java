package oop.labor06.training;

public class DateUtil {
    // is TRUE when is leap year
    public static boolean leapYear(int year) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }


    // is TRUE when valid date
    public static boolean isValidDate(int year, int month, int day) {
        int[] correctMonthsNormalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leapyear = leapYear(year);
        if (year >= 0 && month >= 1 && month <= 12 && day >= 1) {
            if (!leapyear && day <= correctMonthsNormalYear[month - 1]) {
                return true;
            }
            if (leapyear && day <= correctMonthsNormalYear[month - 1]) {
                if(month == 2 && day > 29){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}


