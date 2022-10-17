package Testing.Practice;

public class TinhNgayTiepTheo {
    public static int checkLeapYear(int year){
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))?29:28;
    }
    public static int checkDayOnMonth(int month, int year){
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> checkLeapYear(year);
            default -> -1;
        };
    }

    public static int[] nexDay(int day, int month, int year){
        boolean checkMonth = day < checkDayOnMonth(month,year);

        int dayResuil = (checkMonth) ? day + 1 : 1;
        int monthResuil = (checkMonth) ? month : month + 1;
        int yearResuil = (monthResuil > 12) ? year + 1: year;
        monthResuil = (monthResuil > 12 ) ? 1 : monthResuil;

        return new int[]{dayResuil,monthResuil,yearResuil};
    }

}
