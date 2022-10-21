import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You SSN is: " + ssn);

        String MNumber = SafeInput.getRegExString(in, "What is your M Number?", "(M|m)\\d{5}");
        System.out.println("Your M Number is: " + MNumber);

        String menu = SafeInput.getRegExString(in, "Choose the menu option you would like", "[OoSsVvQq]");
        System.out.println("You chose the " + menu + " option.");
    }
}
