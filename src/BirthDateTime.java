import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day = 0;
        int hours;
        int minutes;

        year = SafeInput.getRangedInt(in,"What year were you born in?", 1950, 2010);
        month = SafeInput.getRangedInt(in, "What month were you born in?", 1, 12);
        switch (month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "What date were you born?",1,30);
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "What date were you born?",1,31 );
                break;

            case 2:
                day = SafeInput.getRangedInt(in,"What date were you born?",1,29);
                break;
        }
        hours = SafeInput.getRangedInt(in, "What hour were you born?", 1, 24);
        minutes = SafeInput.getRangedInt(in, "What minute were you born?", 1, 59);

    }
}
