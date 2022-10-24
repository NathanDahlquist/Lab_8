import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int monthLength = 0;
        Scanner pipe = new Scanner(System.in);

        year = SafeInput.getRangedInt(pipe,"Enter the year of your birth",1950,2010);
        month = SafeInput.getRangedInt(pipe,"Enter the month of your birth",1,12);
        switch (month) {
            case 1,3,5,7,8,10,12 -> monthLength = 31;
            case 2 -> monthLength = 28;
            case 4,6,9,11 -> monthLength = 30;
        }
        day = SafeInput.getRangedInt(pipe,"Enter the day of your birth",1,monthLength);
        hour = SafeInput.getRangedInt(pipe,"Enter the hour of your birth",1,24);
        minute = SafeInput.getRangedInt(pipe,"Enter the minute of your birth",1,59);
        System.out.println("You were born on " + month + " " + day + ", " + year + " at " + hour + ":" + minute);
    }
}